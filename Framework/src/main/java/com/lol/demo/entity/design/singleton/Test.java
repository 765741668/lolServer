/******************************************************************************
 *
 * Module Name:  entity - Test.java
 * Version: 1.0.0
 * Original Author: randyzhyang
 * Created Date: Apr 22, 2016
 * Last Updated By: randyzhyang
 * Last Updated Date: Apr 22, 2016
 * Description:
 *
 *******************************************************************************

 COPYRIGHT  STATEMENT

 Copyright(c) 2011
 by The Hong Kong Jockey Club

 All rights reserved. Copying, compilation, modification, distribution
 or any other use whatsoever of this material is strictly prohibited
 except in accordance with a Software License Agreement with
 The Hong Kong Jockey Club.

 ******************************************************************************/
package com.lol.demo.entity.design.singleton;

public class Test {

    public static void main(String[] args) {
        System.out.println("~~~~~~1~~~~~~~~~");
        StaticSingleton.createString();

        System.out.println("~~~~~~2~~~~~~~~~");
        Singleton.createString();

        System.out.println("~~~~~~3~~~~~~~~~");
        StaticSingleton.getInstance();

        System.out.println("~~~~~~4~~~~~~~~~");
    }

}
