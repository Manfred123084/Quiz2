
package rectangulo;

/**
 *
 * @author jafet
 */
class Rectangulo {
    private int ancho;
    private int altura;

    public void setAncho(int ancho) throws RectanguloException {
        if (ancho <= 0) {
            throw new RectanguloException("El ancho debe ser mayor que 0");
        }
        this.ancho = ancho;
    }

    public void setAltura(int altura) throws RectanguloException {
        if (altura <= 0) {
            throw new RectanguloException("La altura debe ser mayor que 0");
        }
        this.altura = altura;
    }

    public int calcularArea() {
        return ancho * altura;
    }
}

