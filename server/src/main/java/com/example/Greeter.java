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
   * Fonction qui salue une personne dont le nom est passé en paramètre.
   * 
   * @param someone (String) - Le nom de la personne saluée.
   * @return Une phrase de salutation (String)
   */
  public final String greet(final String someone) {
    return String.format("Hello, Martin %s!", someone);
  }
}
