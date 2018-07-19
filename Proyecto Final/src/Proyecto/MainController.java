package Proyecto;


import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class MainController {
	@FXML TextField nombrep;
	@FXML TextField nombree;
	@FXML TextField tipop;
	@FXML TextField cant;
	@FXML TextField prec;
	@FXML Label p;
	@FXML Label p1;
	@FXML Label p2;
	@FXML Label p3;
	@FXML Label p4;
	@FXML Label titulo;
	@FXML Label titulo1;
	@FXML Label label1;
	@FXML Label labelarch;
	@FXML TextArea texta ;
	static ArrayList<String> nop = new ArrayList<String>();
	static ArrayList<String> noe = new ArrayList<String>();
	static ArrayList<String> tip = new ArrayList<String>();
	static ArrayList<String> can = new ArrayList<String>();
	static ArrayList<String> pre = new ArrayList<String>();
	

	
	
	public void Valinsert(ActionEvent event){ 
		p.setText("");
		p1.setText("");
		p2.setText("");
		p3.setText("");
		p4.setText("");
		if(!nombrep.getText().isEmpty()) {
			if(!nombree.getText().isEmpty()) {
				if(!tipop.getText().isEmpty()) {
					if(!cant.getText().isEmpty()) {
						if(!prec.getText().isEmpty()) {
							if(!nombrep.getText().matches("\\d*")) {
								if(!nombree.getText().matches("\\d*")) {
									if(!tipop.getText().matches("\\d*")) {
										if(cant.getText().matches("\\d*")) {
											if(prec.getText().matches("\\d*")) {
												nop.add(nombrep.getText());
												noe.add(nombree.getText());
												tip.add(tipop.getText());
												can.add(cant.getText());
												pre.add(prec.getText());
												
												
											}else {
												p4.setText("Insertar Numeros");

											}
											

											
										}else {
											p3.setText("Insertar Numeros");

										}
										

										
									}else {
										p2.setText("Insertar letras");

									}

									
								}else {
									p1.setText("Insertar letras");

								}

								
							}else {
								p.setText("Insertar letras");

							}
							
							
						}else {
							p4.setText("Campo vacio");
							
						}
						
					}else {
						p3.setText("Campo vacio");
						
					}
					
				}else {
					p2.setText("Campo vacio");
					
				}
				
			}else {
				p1.setText("Campo vacio");
				
			}
			
		}else {
			p.setText("Campo vacio");
			
		}
		
		
		
		
	}
	
	public void Borrar(ActionEvent event) {
		System.out.println("addads");
		System.out.println(nombree.getText());
		nombrep.clear();
		nombree.clear();
		tipop.clear();
		cant.clear();
		prec.clear();
		p.setText("");
		p1.setText("");
		p2.setText("");
		p3.setText("");
		p4.setText("");
		
	}
	
	public void VentanaInsertar(ActionEvent event){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml")); 
			Scene scene=new Scene(root);
			Stage app_page = (Stage)(((Node) event.getSource()).getScene().getWindow());
			app_page.setTitle("Agregar productos");
			app_page.setScene(scene);
			app_page.show();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}
	
	public void VentanaMenu(ActionEvent event){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("MenuPrincipal.fxml")); 
			Scene scene=new Scene(root);
			Stage app_page = (Stage)(((Node) event.getSource()).getScene().getWindow());
			app_page.setTitle("Menu Principal");
			app_page.setScene(scene);
			app_page.show();
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}
	
	public void Ventanaach(ActionEvent event){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Archivo.fxml")); 
			Scene scene=new Scene(root);
			Stage app_page = (Stage)(((Node) event.getSource()).getScene().getWindow());
			app_page.setTitle("Archivo");
			app_page.setScene(scene);
			app_page.show();
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}
	
	public void Arch(ActionEvent event) {
		if(!nop.isEmpty()) {
			String ruta = "C:/Users/BERKIS DIGNA/Desktop/Registros.txt";
	        File file = new File(ruta);
			try {
				if (!file.exists()) {
	                file.createNewFile();
	                FileWriter fw = new FileWriter(file);
	                BufferedWriter bw = new BufferedWriter(fw);
	                PrintWriter wr=new PrintWriter(bw); 
	                for(int x=0;x<nop.size();x++) {
	                	bw.write(nop.get(x)+noe.get(x)+tip.get(x)+can.get(x)+pre.get(x));

	                }
	                if(null != fw) {
	                	wr.close();
	                	bw.close();
	                	
	                }
	         
	            }else {
	            	FileWriter fw = new FileWriter(file);
	                BufferedWriter bw = new BufferedWriter(fw);
	                PrintWriter wr=new PrintWriter(bw); 
	                for(int x=0;x<nop.size();x++) {
	                	wr.write(nop.get(x)+noe.get(x)+tip.get(x)+can.get(x)+pre.get(x));
	                }
	                if(null != fw) {
	                	wr.close();
	                	bw.close();
	                	
	                }
	            	
	            }
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
	
			
		}else {
			labelarch.setText("No hay productos en el almacen");
	
		}
		
		
	}
	
	
	
	
	
	public void Mostrar(ActionEvent event) {
		System.out.println(nop.size());
		for(int x=0;x<nop.size();x++) {
			if(!nop.get(x).isEmpty()) {
				texta.setText(nop.get(x)+noe.get(x)+tip.get(x)+can.get(x)+pre.get(x));
			}
			}
	}
	
	public void Ordenar (ActionEvent event) {
		for(int z=0;z<nop.size();z++) {
			if(!nop.get(z).isEmpty()) {
			int [] arreglo= new int [pre.size()];
			for (int i=0; i<arreglo.length; i++) {
				arreglo[i]=Integer.parseInt(pre.get(i));
			}
			 for (int p = 0; p < arreglo.length - 1; p++) {
		            for (int j = 0; j < arreglo.length - p - 1; j++) {
		                if (arreglo[j + 1] < arreglo[j]) {
		                    int aux = arreglo[j + 1];
		                    arreglo[j + 1] = arreglo[j];
		                    arreglo[j] = aux;
		                }
		            }
		        }
			 for (int i=0; i<arreglo.length; i++) {
				 pre.add(i, Integer.toString(arreglo[i]));
				 texta.setText(pre.get(i));

			 }
			}
			}
		}
	

	

	
	
	

}
