/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer.ui;
 
 import imageviewer.model.Image;
 
 /**
  *
  * @author Ithiel
  */
 public interface ImageDisplay {
     public Image current();
     public void show (Image image);
 }