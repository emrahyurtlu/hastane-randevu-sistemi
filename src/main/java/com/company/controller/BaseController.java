package com.company.controller;

import org.springframework.ui.Model;

/**
 * Bu interface sayesinde controller'ların
 * standartlaştırılması hedeflenmektedir.
 *
 * @param <T> Entity nesnesi alır.
 */
public interface BaseController<T> {
    /**
     * Bu method controller'ın ana sayfasıdır.
     *
     * @return index.html döndürür.
     */
    String index(Model model);

    /**
     * Form sayfasına gider
     *
     * @return form.html
     */
    String add(Model model);

    /**
     * Eklenen nesneyi veri tabanına kaydeder yada
     * günceller.
     *
     * @param entity Entity nesnesi alır.
     * @return show.html
     */
    String save(Model model, T entity);

    /**
     * İstenilen nesnenin detaylarını gösterir.
     *
     * @param entityId Entity id değerini alır.
     * @return show.html
     */
    String show(Model model, Integer entityId);

    /**
     * Düzenlenecek olan entity yi bulup forma sayfasına yönlendirir.
     *
     * @param entityId Entity id değerini alır.
     * @return form.html
     */
    String edit(Model model, Integer entityId);

    /**
     * Id'si gönderilen nesneyi veri tabanından siler.
     *
     * @param entityId Entity id değerini alır.
     * @return index.html döndürür.
     */
    String delete(Integer entityId);
}
