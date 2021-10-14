package kata3;


public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        
        new HistogramDisplay(histogram).execute();
    }
    
}
