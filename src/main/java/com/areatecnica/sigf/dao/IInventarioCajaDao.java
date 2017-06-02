/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.areatecnica.sigf.dao;

import com.areatecnica.sigf.entities.Boleto;
import com.areatecnica.sigf.entities.InventarioCaja;
import java.util.List;

/**
 *
 * @author ianfr
 */
public interface IInventarioCajaDao<T> extends IGenericDAO<T>{
    
    public List<InventarioCaja> findByBoletoEstado(Boleto boleto, Boolean estado);
    
    public List<InventarioCaja> findByEstado(Boolean estado);
    
}