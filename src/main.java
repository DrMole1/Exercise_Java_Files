import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
 
//=====================================================
//
// BUT : 1) Lire un fichier
// 2) Compter un fichier
// 3) Ecrire dans un fichier le nombre de voyelle
//
//=====================================================


public class main {

	public static void main(String[] args) {
		
		//Ici, nous cr�ons un "�criveur" de fichier avec un constructeur recevant le nom du fichier (en txt) ainsi que l'encodage
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("monfichier.txt", "UTF-8");
		} catch (FileNotFoundException e) { //Si le fichier n'est pas trouv�
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) { //Si l'encodage n'est pas support�
			e.printStackTrace();
		} finally {
			System.out.println("Fichier texte cr��.");
		}
		
		//Ici, nous �crivons dans le fichier une phrase basique mais vraie
		writer.println("Je veux avoir cours avec Grace tout les jours.");
		//Ici, nous fermons le fichier
		writer.close();
		
		//D�claration d'un "lecteur" de fichier ainsi que d'une variable tampon qui comprendra le texte
		BufferedReader reader = null;
	    String ligne = "";
	    String texte= "";
	    
	    //Ici, nous ouvrons le fichier pr�c�demment cr�� afin de le lire
	    try
	      {
		reader = new BufferedReader(new FileReader("monfichier.txt"));
	      }
	    catch(FileNotFoundException exc) //Si le fichier n'est pas trouv�
	      {
		System.out.println("Erreur d'ouverture");
	      }
	    finally {
	    	System.out.println("Fichier texte pr�t � �tre lu.");
	    }
	    
	    
	    //Ici, nous lisons le texte, et nous l'affectons � la variable tampon de type string, puis nous concat�nons � la variable texte
	    try {
			while ((ligne = reader.readLine()) != null)
			{
				System.out.println(ligne);
				texte = texte + " " + ligne;
			}	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
	    	System.out.println("Fichier lu.");
	    }
	    
	    //Ici, nous fermons le lecteur
	    try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
	    	System.out.println("Lecteur ferm�.");
	    }
	    
	    
	    //D�claration des variables de compteurs
	    int nCptA = 0;
	    int nCptE = 0;
	    int nCptY = 0;
	    int nCptU = 0;
	    int nCptI = 0;
	    int nCptO = 0;
	    
	    //Maintenant, nous passons cette variable string en lower case puis nous comptons les voyelles
	    texte.toLowerCase();
	    
	    for(int i = 0; i < texte.length(); i++)
	    {
	    	switch(texte.charAt(i)) {
	    	  case 'a':
	    		  nCptA++;
	    		  break;
	    	  case 'e':
	    		  nCptE++;
	    		  break;
	    	  case 'y':
	    		  nCptY++;
	    		  break;
	    	  case 'u':
	    		  nCptU++;
	    		  break;
	    	  case 'i':
	    		  nCptI++;
	    		  break;
	    	  case 'o':
	    		  nCptO++;
	    		  break;
	    	  default:
	    	}
	    }
	    
	    
	  //Ici, nous cr�ons un "�criveur" de fichier pour le fichier voyelle
	  try {
	  	writer = new PrintWriter("voyelles.txt", "UTF-8");
	  } catch (FileNotFoundException e) { //Si le fichier n'est pas trouv�
	  	e.printStackTrace();
	  } catch (UnsupportedEncodingException e) { //Si l'encodage n'est pas support�
	  	e.printStackTrace();
	  } finally {
	  	System.out.println("Fichier voyelles cr��.");
	  }
	  		
	  //Ici, nous �crivons dans le fichier les compteurs de voyelles pour chaque voyelle
	  writer.println("Nombre de A : " + nCptA);
	  writer.println("Nombre de E : " + nCptE);
	  writer.println("Nombre de Y : " + nCptY);
	  writer.println("Nombre de U : " + nCptU);
	  writer.println("Nombre de I : " + nCptI);
	  writer.println("Nombre de O : " + nCptO);
	  //Ici, nous fermons le fichier
	  writer.close();
	    
	  
	    
	  //Ici, nous ouvrons le fichier pr�c�demment cr�� afin de le lire
	  try
	  {
		  reader = new BufferedReader(new FileReader("voyelles.txt"));
	  }
	  catch(FileNotFoundException exc) //Si le fichier n'est pas trouv�
	  {
		  System.out.println("Erreur d'ouverture");
	  }
	  finally {
		  System.out.println("Fichier voyelles pr�t � �tre lu.");
	  }
	    
	    
	  //Ici, nous lisons le texte, et nous l'affectons � la variable tampon de type string, puis nous concat�nons � la variable texte
	  try {
		  while ((ligne = reader.readLine()) != null)
		  {
			System.out.println(ligne);
		  }	
	  } catch (IOException e) {
			e.printStackTrace();
	  } finally {
	    	System.out.println("Fichier voyelles lu.");
	  }
	    

	}

}
