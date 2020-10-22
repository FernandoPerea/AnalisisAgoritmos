/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafcas;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import java.awt.Dimension;
import org.jfree.chart.ChartFrame;

public class GraficaTiempo {
    
    // grafica 
    private JFreeChart grafica;
    // colección de series 
    private XYSeriesCollection series;
    private String ejeX,ejeY,titulo;
    
    public GraficaTiempo (String ejeX,String ejeY,String titulo){
        this.grafica = null;
        this.series = new XYSeriesCollection();
        this.titulo = titulo;
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    } 

    public GraficaTiempo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void agregarSerie(int[] datos, String id){
     // crear la serie
        XYSeries serie = new XYSeries(id);
        for(int x=0;x<datos.length;x++){
            serie.add(x, datos[x]);//es (x,y) en el eje x-->Cantidad de datos que tiene el arreglo   y el el y-->tiempo que tardo
                        serie.add(x, 0);

        }
        this.series.addSeries(serie);
    
    }
    public void agregarSerie(Double[] datos, String id){
     // crear la serie
        XYSeries serie = new XYSeries(id);
        for(int x=0;x<datos.length;x++){
            serie.add(x, datos[x]);//es (x,y) en el eje x-->Cantidad de datos   y el el y-->tiempo que tardo
        }
        this.series.addSeries(serie);
    
    }
    
    public void agregarSerie(double[] datos, String id){
     // crear la serie
        XYSeries serie = new XYSeries(id);
        for(int x=0;x<datos.length;x++){
            serie.add(x, datos[x]);
            serie.add(x, 0);

        }
        this.series.addSeries(serie);
    }
    
    public void creaYmuestraGrafica(){
    
        this.grafica = ChartFactory.
        createXYLineChart(titulo, ejeX, ejeY, series);
        ChartFrame panel = new ChartFrame(titulo, grafica);
        panel.pack();
        panel.setVisible(true);
            
    }
    
}

//public class GraficaTiempo extends ApplicationFrame{
//    public GraficaTiempo(double[] x,String nombre){
//        super("Graficador");
//        XYDataset paresDeDatos = generarDatos(x);
//        JFreeChart diagrama = crearDiagrama(paresDeDatos,nombre);
//        ChartPanel chartPanel = new ChartPanel(diagrama);
//        chartPanel.setPreferredSize(new Dimension(500,400));
//        setContentPane(chartPanel);
//    }
//
//    public XYDataset generarDatos(double[] data){
//        //le pasamos una funcion generadora f(x)
//        XYSeries datos = new XYSeries("Linea Funcion");
//        for(int x=0; x< data.length; x++){
//            datos.add(x,data[x]);
//            datos.add(x,0);
//        }
//        XYSeriesCollection conjuntoDatos = new XYSeriesCollection();
//        conjuntoDatos.addSeries(datos);
//        
//        return conjuntoDatos;
//    }
//
//    private JFreeChart crearDiagrama(XYDataset conjuntoDatos,String x){
//        JFreeChart diag = ChartFactory.createXYLineChart(
//                                x, //Titulo Grafica
//                                "#Datos", // Leyenda eje X
//                                "Tiempo", // Leyenda eje Y
//                                conjuntoDatos, // Los datos
//                                PlotOrientation.VERTICAL, //orientacion
//                                false, // ver titulo de linea
//                                false, //tooltips
//                                false  //URL
//                            );
//        return diag;
//    }
//
//    //aqui definimos la funcion que desees, en esta caso la f(x) = 4sen(x)
//   
//
//    public static void main(String[] arg){
//       
//    }
//}