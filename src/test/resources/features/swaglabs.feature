Feature: Logueo y carga de la app

  @test1
  Scenario: Logueo y carga de los items en el app Swag Labs

    Given accedo a la aplicacion
    When inicio sesion con las credenciales  usuario "standard_user" y contraseña "secret_sauce"
    Then valido que deberia aparecer el titulo "PRODUCTS"
    And también valido que al menos exista un item llamado "Sauce Labs Backpack"


