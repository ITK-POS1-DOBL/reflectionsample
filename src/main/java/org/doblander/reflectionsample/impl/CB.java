/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.doblander.reflectionsample.impl;

import org.doblander.reflectionsample.service.HelloMeth;

/**
 *
 * @author intruder
 */
public class CB implements HelloMeth {

    @Override
    public void hello() {
        System.out.println("hello CB");
    }
    
}
