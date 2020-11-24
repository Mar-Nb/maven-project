package com.example;

/**
 * Classe contenant une fonction d'accueil.
 */
public class Greeter {

  /**
   * Constructeur vide.
   */
  public Greeter() {

  }

  /**
   * public final String greet(String)
   * Fonction qui salue une personne dont le nom est passé en paramètre.
   * 
   * @param String someone - Le nom de la personne saluée.
   * @return String - Une phrase de salutation
   */
  public final String greet(final String someone) {
    return String.format("Hello, Martin %s!", someone);
  }
}
