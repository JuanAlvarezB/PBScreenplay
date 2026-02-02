@CrearCliente
Feature: login and create an user

  Background: login
    Given user access the siigo page
    And user logs in the system
      | user     | pass         |
      | userTest | passwordTest |

  @tag1
  Scenario Outline: create a new client
    Given user selects the option to create a third
    When user fills the form Datos basicos with '<Name>','<lastName>', '<businessName>', '<city>', '<address>', '<sucursalCode>','<id>','<indicative>','<phone>'
    And user fills the form Datos para facturacion with '<email>','<zip>'
    And user fills the form Datos Bancarios with '<holderName>','<accountNumber>'
    And user fills the form Contactos with '<contactName>','<lastNameContact>','<contactEmail>','<position>','<contactPhone>'
    Then user validates the confirm message '<status>'
    And user validate the '<fullName>'
    Examples:
      | Name        | lastName        | businessName | city     | address     | sucursalCode | id         | indicative | phone      | email         | zip    | holderName          | accountNumber | contactName  | lastNameContact   | contactEmail          | position | contactPhone | status | fullName                    |
      | Juan Camilo | Alvarez Barrios | JuanA        | Monteria | calle 27 #2 | 23119        | 1067451542 | 57         | 3116238546 | h@hotmail.com | 230001 | Juan Camilo Alvarez | 522000037725  | José Gabriel | Barrios Carrascal | josbarrios2@gmail.com | QA       | 3106344756   | Activo | Juan Camilo Alvarez Barrios |