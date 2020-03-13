package com.company.controller;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.UUID;

/**
 * Bu interface sayesinde controller'ların
 * standartlaştırılması hedeflenmektedir.
 *
 * @param <T> Entity nesnesi alır.
 */
public abstract class AbstractBaseController<T> {


    /**
     * Bu method controller'ın ana sayfasıdır.
     *
     * @return index.html döndürür.
     */
    String index(Model model) {
        return null;
    }

    /**
     * Form sayfasına gider
     *
     * @return form.html
     */
    String add(Model model) {
        return null;
    }

    /**
     * Eklenen nesneyi veri tabanına kaydeder yada
     * günceller.
     *
     * @param entity Entity nesnesi alır.
     * @return show.html
     */
    String save(Model model, T entity) {
        return null;
    }

    /**
     * İstenilen nesnenin detaylarını gösterir.
     *
     * @param entityId Entity id değerini alır.
     * @return show.html
     */
    String show(Model model, Integer entityId) {
        return null;
    }

    /**
     * Düzenlenecek olan entity yi bulup forma sayfasına yönlendirir.
     *
     * @param entityId Entity id değerini alır.
     * @return form.html
     */
    String edit(Model model, Integer entityId) {
        return null;
    }

    /**
     * Id'si gönderilen nesneyi veri tabanından siler.
     *
     * @param entityId Entity id değerini alır.
     * @return index.html döndürür.
     */
    String delete(Integer entityId) {
        return null;
    }

    String upload(MultipartFile multipartFile, String uploadPath) {
        var fileName = "";
        try {
            //create unique string
            var uuid = UUID.randomUUID().toString();

            //combine all of them
            fileName = String.format("%s%s_%s", uploadPath, uuid, multipartFile.getOriginalFilename());

            //full file name
            //String filePath = uploadPath + fileName.toLowerCase();
            System.out.println(fileName);

            multipartFile.transferTo(Paths.get("./" + fileName));

            return fileName;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileName;
    }
}