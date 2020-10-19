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

public class GraficaTiempo extends ApplicationFrame{
    public GraficaTiempo(double[] x,String nombre){
        super("Graficador");
        XYDataset paresDeDatos = generarDatos(x);
        JFreeChart diagrama = crearDiagrama(paresDeDatos,nombre);
        ChartPanel chartPanel = new ChartPanel(diagrama);
        chartPanel.setPreferredSize(new Dimension(500,400));
        setContentPane(chartPanel);
    }

    public XYDataset generarDatos(double[] data){
        //le pasamos una funcion generadora f(x)
        XYSeries datos = new XYSeries("Linea Funcion");
        for(int x=0; x< data.length; x++){
            datos.add(x,data[x]);
        }
        XYSeriesCollection conjuntoDatos = new XYSeriesCollection();
        conjuntoDatos.addSeries(datos);
        
        return conjuntoDatos;
    }

    private JFreeChart crearDiagrama(XYDataset conjuntoDatos,String x){
        JFreeChart diag = ChartFactory.createXYLineChart(
                                x, //Titulo Grafica
                                "#Datos", // Leyenda eje X
                                "Tiempo", // Leyenda eje Y
                                conjuntoDatos, // Los datos
                                PlotOrientation.VERTICAL, //orientacion
                                false, // ver titulo de linea
                                false, //tooltips
                                false  //URL
                            );
        return diag;
    }

    //aqui definimos la funcion que desees, en esta caso la f(x) = 4sen(x)
   

    public static void main(String[] arg){
       
    }
}