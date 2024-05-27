package org.choongang.main.controllers;

import org.choongang.global.AbstractController;
import org.choongang.global.constants.Menu;
import org.choongang.templete.Templetes;

/**
 * 메인 컨트롤러
 *
 */
public class MainController extends AbstractController {
    @Override
    public void show() {


        Templetes.getInstance().render(Menu.MAIN);
    }
}