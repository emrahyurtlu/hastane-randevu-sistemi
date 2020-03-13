package com.company.controller;

import com.company.complextype.DoctorComplex;
import com.company.entity.Doctor;
import com.company.service.DoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class DoctorController extends AbstractBaseController<DoctorComplex> {
    private final DoctorService _doctorService;

    public DoctorController(DoctorService doctorService) {
        _doctorService = doctorService;
    }

    @RequestMapping("/doctors")
    @Override
    public String index(Model model) {
        var doctors = _doctorService.getList();
        model.addAttribute("doctors", doctors);
        return "doctors/index";
    }

    @RequestMapping("/doctors/add")
    @Override
    public String add(Model model) {
        model.addAttribute("doctorComplex", new DoctorComplex());
        return "doctors/form";
    }

    @PostMapping("/doctors/save")
    @Override
    public String save(Model model, DoctorComplex doctorComplex) {
        MultipartFile file = doctorComplex.getFile();
        Doctor doctor = doctorComplex.getDoctor();

        if (!file.isEmpty()) {
            System.out.println("Dosya geldi: " + file.getOriginalFilename());
            var fileName = upload(file, "uploads/");

            doctor.setImageLink(fileName);
        }

        _doctorService.save(doctor);

        return "redirect:/doctors";
    }

    @RequestMapping("/doctors/show/{entityId}")
    @Override
    public String show(Model model, @PathVariable Integer entityId) {
        var doctor = _doctorService.get(entityId);
        model.addAttribute("doctor", doctor);
        return "doctors/show";
    }

    @RequestMapping("/doctors/edit/{entityId}")
    @Override
    public String edit(Model model, @PathVariable Integer entityId) {
        var doctor = _doctorService.get(entityId);
        model.addAttribute("doctor", doctor);
        return "doctors/form";
    }

    @RequestMapping("/doctors/remove/{entityId}")
    @Override
    public String delete(@PathVariable Integer entityId) {
        _doctorService.delete(entityId);
        return "redirect:/doctors";
    }
}
