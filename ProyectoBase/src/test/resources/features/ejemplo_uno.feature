#Autor: juacamal@bamcolombia.com.co

@RealizarCompras
Feature: logearse en saucedemo y realizar una compra


  Background: login
    Given accede a la página de saucedemo
    And el usuario inicia sesión en el sistema de saucedemo
      | user       | password       |
      | userPrueba | passwordPrueba |


  @Compra
  Scenario: Realizar compra numero 1
    When el agrega un producto al carrito hasta finalizar la compra
    And el usuario ingresa los datos de envío
      | nombre | apellido | codigo_postal |
      | Juan   | Camacho  | 12345         |
    Then valida que la compra se haya realizado correctamente visualizando el mensaje de confirmación
      | mensaje                   |
      | Thank you for your order! |


  @ComprarVarias
  Scenario Outline: Realizar compra numero 2
    When selecciona unos productos para agregarlos al carrito
    And ingresa la informacion de "<nombre>", "<apellido>" y "<codigo_postal>"
    Then el usuario visualiza el "<mensaje>"
    Examples:
      | nombre | apellido | codigo_postal | mensaje                   |
      | Juan   | Camacho  | 12345         | Thank you for your order! |
      | Maria  | Lopez    | 67890         | Thank you for your order! |