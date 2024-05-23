package ar.edu.utn.frba.dds;

public class Main {
  public static void main(String[] args) {

    Guardarropa guardarropa = new Guardarropa();

    Prenda zapato = new Prenda(TipoDePrenda.ZAPATO);
    guardarropa.setBorrador(zapato);

    Prenda remera = new Prenda(TipoDePrenda.REMERA);
    remera.setMaterial(Material.ALGODON);
    remera.setColorPrincipal(Colores.NEGRO);
    remera.setColorSecundario(Colores.ROJO);
    remera.setTrama(Trama.ESTAMPADO);
    guardarropa.agregarPrenda(remera);


    guardarropa.borrador.setColorPrincipal(Colores.MARRON);
    guardarropa.borrador.setMaterial(Material.CUERO);
    guardarropa.agregarPrenda(guardarropa.getBorrador());


    Prenda pantalon = new Prenda(TipoDePrenda.PANTALON);
    pantalon.setMaterial(Material.JEAN);
    pantalon.setColorPrincipal(Colores.AZUL);
    guardarropa.agregarPrenda(pantalon);

    guardarropa.mostrarGuardarropas();


    Uniforme uniforme1 = new Uniforme(remera, pantalon, zapato);
    Institucion colegioSanJuan = new Institucion("Colegio San Juan", uniforme1);
    System.out.println("Colegio: " + colegioSanJuan.nombre);
    colegioSanJuan.uniforme.mostrarUniforme();



  }
}