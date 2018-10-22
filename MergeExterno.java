/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergeexterno;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DELL
 */
public class MergeExterno {
        public static final String fileName1 = "C:\\Users\\DELL\\Downloads\\arquivo1.dat";
	public static final String fileName2 = "C:\\Users\\DELL\\Downloads\\arquivo2.dat";
	public static final String fileName3 = "C:\\Users\\DELL\\Downloads\\arquivo3.dat";
        public static final String fileName4 = "C:\\Users\\DELL\\Downloads\\arquivo4.dat";
        public static final String fileName5 = "C:\\Users\\DELL\\Downloads\\arquivo5.dat";
        public static final String fileName6 = "C:\\Users\\DELL\\Downloads\\arquivo6.dat";
        public static final String fileName7 = "C:\\Users\\DELL\\Downloads\\arquivo7.dat";
        public static final String fileName8 = "C:\\Users\\DELL\\Downloads\\arquivo8.dat";
        public static final String fileName9 = "C:\\Users\\DELL\\Downloads\\arquivo9.dat";
        public static final String fileName10 = "C:\\Users\\DELL\\Downloads\\arquivo10.dat";
        public static final String fileName11 = "C:\\Users\\DELL\\Downloads\\arquivo11.dat";
        public static final String fileName12 = "C:\\Users\\DELL\\Downloads\\arquivo12.dat";
        public static final String fileName13 = "C:\\Users\\DELL\\Downloads\\arquivo13.dat";
        public static final String fileName14 = "C:\\Users\\DELL\\Downloads\\arquivo14.dat";
        public static final String fileName15 = "C:\\Users\\DELL\\Downloads\\arquivo15.dat";
        public static final String fileName16 = "C:\\Users\\DELL\\Downloads\\arquivo16.dat";
        public static final String fileName17 = "C:\\Users\\DELL\\Downloads\\arquivo17.dat";
        public static final String fileName18 = "C:\\Users\\DELL\\Downloads\\arquivo18.dat";
        public static final String fileName19 = "C:\\Users\\DELL\\Downloads\\arquivo19.dat";
    public static void main(String[] args)throws FileNotFoundException, IOException {
        
	       
        try{
            RandomAccessFile f = new RandomAccessFile("C:\\Users\\DELL\\Downloads\\cep.dat", "r");
            
            Endereco e = new Endereco();
            Endereco g = new Endereco();
            long inicio = 0;
            long fim = f.length()/300 - 1;//usando .length sem subtrair um, acarretaria um out of bounds
            long parada = fim / 10;
            RandomAccessFile arquivo1 = new RandomAccessFile(fileName1, "rw");
            RandomAccessFile arquivo2 = new RandomAccessFile(fileName2, "rw");
            RandomAccessFile arquivo3 = new RandomAccessFile(fileName3, "rw");
            RandomAccessFile arquivo4 = new RandomAccessFile(fileName4, "rw");
            RandomAccessFile arquivo5 = new RandomAccessFile(fileName5, "rw");
            RandomAccessFile arquivo6 = new RandomAccessFile(fileName6, "rw");
            RandomAccessFile arquivo7 = new RandomAccessFile(fileName7, "rw");
            RandomAccessFile arquivo8 = new RandomAccessFile(fileName8, "rw");
            RandomAccessFile arquivo9 = new RandomAccessFile(fileName9, "rw");
            RandomAccessFile arquivo10 = new RandomAccessFile(fileName10, "rw");
            RandomAccessFile arquivo11 = new RandomAccessFile(fileName11, "rw");
            RandomAccessFile arquivo12 = new RandomAccessFile(fileName12, "rw");
            RandomAccessFile arquivo13 = new RandomAccessFile(fileName13, "rw");
            RandomAccessFile arquivo14 = new RandomAccessFile(fileName14, "rw");
            RandomAccessFile arquivo15 = new RandomAccessFile(fileName15, "rw");
            RandomAccessFile arquivo16 = new RandomAccessFile(fileName16, "rw");
            RandomAccessFile arquivo17 = new RandomAccessFile(fileName17, "rw");
            RandomAccessFile arquivo18 = new RandomAccessFile(fileName18, "rw");
            RandomAccessFile arquivo19 = new RandomAccessFile(fileName19, "rw");
            f.seek(inicio);
            List<Endereco> lista = new ArrayList<>();
            while (inicio < parada){
                e.leEndereco(f);
                organizaEndereco(e, lista);
                inicio++;
            }
            for (Endereco end: lista){
                e.escreveEndereco(arquivo1);
            }
            lista.clear();
            while (inicio < parada){
                e.leEndereco(f);
                organizaEndereco(e, lista);
                inicio++;
            }
            for (Endereco end: lista){
                e.escreveEndereco(arquivo2);
            }
            lista.clear();
            while (inicio < parada){
                e.leEndereco(f);
                organizaEndereco(e, lista);
                inicio++;
            }
            for (Endereco end: lista){
                e.escreveEndereco(arquivo3);
            }
            lista.clear();
            while (inicio < parada){
                e.leEndereco(f);
                organizaEndereco(e, lista);
                inicio++;
            }
            for (Endereco end: lista){
                e.escreveEndereco(arquivo4);
            }
            lista.clear();
            while (inicio < parada){
                e.leEndereco(f);
                organizaEndereco(e, lista);
                inicio++;
            }
            for (Endereco end: lista){
                e.escreveEndereco(arquivo5);
            }
            lista.clear();
            while (inicio < parada){
                e.leEndereco(f);
                organizaEndereco(e, lista);
                inicio++;
            }
            for (Endereco end: lista){
                e.escreveEndereco(arquivo6);
            }
            lista.clear();
            while (inicio < parada){
                e.leEndereco(f);
                organizaEndereco(e, lista);
                inicio++;
            }
            for (Endereco end: lista){
                e.escreveEndereco(arquivo7);
            }
            lista.clear();
            while (inicio < parada){
                e.leEndereco(f);
                organizaEndereco(e, lista);
                inicio++;
            }
            for (Endereco end: lista){
                e.escreveEndereco(arquivo8);
            }
            lista.clear();
            while (inicio < parada){
                e.leEndereco(f);
                organizaEndereco(e, lista);
                inicio++;
            }
            for (Endereco end: lista){
                e.escreveEndereco(arquivo9);
            }
            lista.clear();
            while (inicio < parada){
                e.leEndereco(f);
                organizaEndereco(e, lista);
                inicio++;
            }
            for (Endereco end: lista){
                e.escreveEndereco(arquivo10);
            }
            lista.clear();
            inicio = 0;
            int p = 0;
            int j = 0;
            int k = 0;
            long tam1 = arquivo1.length()/300;
            long tam2 = arquivo2.length()/300;
            while(arquivo1.length()> 0 && arquivo2.length() > 0){
                arquivo1.seek(inicio);
                e.leEndereco(arquivo1);
                arquivo2.seek(inicio);
                g.leEndereco(arquivo2);
            }
            while (p < tam1 && j < tam2) {
                        if (g.compareTo(e) < 0){
                        g.escreveEndereco(arquivo11);
                        g.leEndereco(arquivo1);   
                        p++;
                    }
                    else{
                        e.escreveEndereco(arquivo11);
                        e.leEndereco(arquivo2);   
                        j++;
                    }
                    k++;
                }


              while (p < tam1) {
                        g.escreveEndereco(arquivo11);
                        g.leEndereco(arquivo1);   
                    }
              while (j < tam2) {
                        e.escreveEndereco(arquivo11);
                        e.leEndereco(arquivo2);   
              }
              inicio = 0;
            p = 0;
            j = 0;
            k = 0;
            tam1 = arquivo3.length()/300;
            tam2 = arquivo4.length()/300;
            while(arquivo3.length()> 0 && arquivo4.length() > 0){
                arquivo3.seek(inicio);
                e.leEndereco(arquivo3);
                arquivo4.seek(inicio);
                g.leEndereco(arquivo4);
            }
            while (p < tam1 && j < tam2) {
                        if (g.compareTo(e) < 0){
                        g.escreveEndereco(arquivo12);
                        g.leEndereco(arquivo3);   
                        p++;
                    }
                    else{
                        e.escreveEndereco(arquivo12);
                        e.leEndereco(arquivo4);   
                        j++;
                    }
                    k++;
                }


              while (p < tam1) {
                        g.escreveEndereco(arquivo12);
                        g.leEndereco(arquivo3);   
                    }
              while (j < tam2) {
                        e.escreveEndereco(arquivo12);
                        e.leEndereco(arquivo4);   
              }
                inicio = 0;
            p = 0;
            j = 0;
            k = 0;
            tam1 = arquivo5.length()/300;
            tam2 = arquivo6.length()/300;
            while(arquivo5.length()> 0 && arquivo6.length() > 0){
                arquivo5.seek(inicio);
                e.leEndereco(arquivo5);
                arquivo6.seek(inicio);
                g.leEndereco(arquivo6);
            }
            while (p < tam1 && j < tam2) {
                        if (g.compareTo(e) < 0){
                        g.escreveEndereco(arquivo13);
                        g.leEndereco(arquivo5);   
                        p++;
                    }
                    else{
                        e.escreveEndereco(arquivo13);
                        e.leEndereco(arquivo6);   
                        j++;
                    }
                    k++;
                }


              while (p < tam1) {
                        g.escreveEndereco(arquivo13);
                        g.leEndereco(arquivo5);   
                    }
              while (j < tam2) {
                        e.escreveEndereco(arquivo13);
                        e.leEndereco(arquivo6);   
              }
                  inicio = 0;
            p = 0;
            j = 0;
            k = 0;
            tam1 = arquivo7.length()/300;
            tam2 = arquivo8.length()/300;
            while(arquivo7.length()> 0 && arquivo8.length() > 0){
                arquivo7.seek(inicio);
                e.leEndereco(arquivo7);
                arquivo8.seek(inicio);
                g.leEndereco(arquivo8);
            }
            while (p < tam1 && j < tam2) {
                        if (g.compareTo(e) < 0){
                        g.escreveEndereco(arquivo14);
                        g.leEndereco(arquivo7);   
                        p++;
                    }
                    else{
                        e.escreveEndereco(arquivo14);
                        e.leEndereco(arquivo8);   
                        j++;
                    }
                    k++;
                }


              while (p < tam1) {
                        g.escreveEndereco(arquivo14);
                        g.leEndereco(arquivo7);   
                    }
              while (j < tam2) {
                        e.escreveEndereco(arquivo14);
                        e.leEndereco(arquivo8);   
              }
                  inicio = 0;
            p = 0;
            j = 0;
            k = 0;
            tam1 = arquivo9.length()/300;
            tam2 = arquivo10.length()/300;
            while(arquivo9.length()> 0 && arquivo10.length() > 0){
                arquivo9.seek(inicio);
                e.leEndereco(arquivo9);
                arquivo10.seek(inicio);
                g.leEndereco(arquivo10);
            }
            while (p < tam1 && j < tam2) {
                        if (g.compareTo(e) < 0){
                        g.escreveEndereco(arquivo15);
                        g.leEndereco(arquivo9);   
                        p++;
                    }
                    else{
                        e.escreveEndereco(arquivo15);
                        e.leEndereco(arquivo10);   
                        j++;
                    }
                    k++;
                }


              while (p < tam1) {
                        g.escreveEndereco(arquivo15);
                        g.leEndereco(arquivo9);   
                    }
              while (j < tam2) {
                        e.escreveEndereco(arquivo15);
                        e.leEndereco(arquivo10);   
              }
                  inicio = 0;
            p = 0;
            j = 0;
            k = 0;
            tam1 = arquivo11.length()/300;
            tam2 = arquivo2.length()/300;
            while(arquivo11.length()> 0 && arquivo12.length() > 0){
                arquivo11.seek(inicio);
                e.leEndereco(arquivo11);
                arquivo12.seek(inicio);
                g.leEndereco(arquivo12);
            }
            while (p < tam1 && j < tam2) {
                        if (g.compareTo(e) < 0){
                        g.escreveEndereco(arquivo16);
                        g.leEndereco(arquivo11);   
                        p++;
                    }
                    else{
                        e.escreveEndereco(arquivo16);
                        e.leEndereco(arquivo12);   
                        j++;
                    }
                    k++;
                }


              while (p < tam1) {
                        g.escreveEndereco(arquivo16);
                        g.leEndereco(arquivo11);   
                    }
              while (j < tam2) {
                        e.escreveEndereco(arquivo16);
                        e.leEndereco(arquivo12);   
              }
                  inicio = 0;
            p = 0;
            j = 0;
            k = 0;
            tam1 = arquivo13.length()/300;
            tam2 = arquivo14.length()/300;
            while(arquivo13.length()> 0 && arquivo14.length() > 0){
                arquivo13.seek(inicio);
                e.leEndereco(arquivo17);
                arquivo14.seek(inicio);
                g.leEndereco(arquivo17);
            }
            while (p < tam1 && j < tam2) {
                        if (g.compareTo(e) < 0){
                        g.escreveEndereco(arquivo17);
                        g.leEndereco(arquivo13);   
                        p++;
                    }
                    else{
                        e.escreveEndereco(arquivo17);
                        e.leEndereco(arquivo14);   
                        j++;
                    }
                    k++;
                }


              while (p < tam1) {
                        g.escreveEndereco(arquivo17);
                        g.leEndereco(arquivo13);   
                    }
              while (j < tam2) {
                        e.escreveEndereco(arquivo17);
                        e.leEndereco(arquivo14);   
              }
                  inicio = 0;
            p = 0;
            j = 0;
            k = 0;
            tam1 = arquivo17.length()/300;
            tam2 = arquivo16.length()/300;
            while(arquivo17.length()> 0 && arquivo16.length() > 0){
                arquivo17.seek(inicio);
                e.leEndereco(arquivo17);
                arquivo16.seek(inicio);
                g.leEndereco(arquivo16);
            }
            while (p < tam1 && j < tam2) {
                        if (g.compareTo(e) < 0){
                        g.escreveEndereco(arquivo18);
                        g.leEndereco(arquivo17);   
                        p++;
                    }
                    else{
                        e.escreveEndereco(arquivo18);
                        e.leEndereco(arquivo16);   
                        j++;
                    }
                    k++;
                }


              while (p < tam1) {
                        g.escreveEndereco(arquivo18);
                        g.leEndereco(arquivo17);   
                    }
              while (j < tam2) {
                        e.escreveEndereco(arquivo18);
                        e.leEndereco(arquivo16);   
              }
                  inicio = 0;
            p = 0;
            j = 0;
            k = 0;
            tam1 = arquivo15.length()/300;
            tam2 = arquivo18.length()/300;
            while(arquivo15.length()> 0 && arquivo18.length() > 0){
                arquivo15.seek(inicio);
                e.leEndereco(arquivo15);
                arquivo18.seek(inicio);
                g.leEndereco(arquivo18);
            }
            while (p < tam1 && j < tam2) {
                        if (g.compareTo(e) < 0){
                        g.escreveEndereco(arquivo19);
                        g.leEndereco(arquivo15);   
                        p++;
                    }
                    else{
                        e.escreveEndereco(arquivo19);
                        e.leEndereco(arquivo18);   
                        j++;
                    }
                    k++;
                }


              while (p < tam1) {
                        g.escreveEndereco(arquivo19);
                        g.leEndereco(arquivo15);   
                    }
              while (j < tam2) {
                        e.escreveEndereco(arquivo19);
                        e.leEndereco(arquivo18);   
              }
    }
            catch(IOException ex){
        
                System.out.println("Arquivo não encontrado");
        
            }
        }
    public static List organizaEndereco(Endereco e, List lista){
        
        lista.add(e);
        Collections.sort(lista);
        return lista;
    }
}   
