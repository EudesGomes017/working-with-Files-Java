package application;

/*Fazer um programa para ler o caminho de um arquivo.txt
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula.*/




import entities.Products;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "D:\\CursoJAVA\\trabalhando com arquivos\\Products\\Products.txt";

        List<Products> list = new ArrayList<Products>();

        //abrir nosso arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine(); //ler a primeira linha
            line = br.readLine();
            while (line != null) {

                String[] vect = line.split(",");
                String name = vect[0]; //posicção 0 que o split corto o primeiro produto(nome do produto)
                Double price = Double.parseDouble(vect[1]);//posicção 1(preço)
                Integer quantity = Integer.parseInt(vect[2]); //posicção 2(quantidade)

                Products prod = new Products(name, price, quantity); //instanciamos
                list.add(prod); //adicionar na lista

                line = br.readLine(); //ler proxima linha
            }

            System.out.println("PRODUCTS:");
            for (Products p : list) {
                System.out.println(p);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }



    }

