
@stories
Feature: Reto101
  como usuario, quiero verficar el funcionamiento de la pagina colorlib
  Background:
    Given  Ana quiere ingresar a la pagina colorlib
    When Seleccione en el menu la opcion validations
  @scenario1
  Scenario: verificar el formulario Block Validation
    Then verifique el titulo del formulario Block Validation
  @scenario2
  Scenario: verificar el formulario Inline Validation
    Then  Verifique el titulo del formulario Inline Validation
  @scenario3
  Scenario: datos erroneos en el formulario
    Then  Los datos del formulario Inline Validation son erroneos