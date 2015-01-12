package jline;

public class MinttyTerminal extends TerminalSupport {

    public MinttyTerminal() {
        super(true);
    }

    @Override
    public void init() throws Exception {
        super.init();

        super.setAnsiSupported(true);
        super.setEchoEnabled(false);
    }
    
    @Override
    public String getOutputEncoding() {
        String sw = System.getenv("LANG");
        int pos ;
        if( sw != null && (pos=sw.lastIndexOf('.')) > 0)
            sw = sw.substring(pos+1);
        if( sw != null )
            return sw;
        return super.getOutputEncoding();

    }

    
    @Override
    public int getWidth() {
        String sw = System.getenv("COLS");
        try {
        if( sw != null )
            return Integer.parseInt(sw);
        } catch( NumberFormatException e ){
            jline.internal.Log.trace("exeption parsing COLS variable", sw );
        }
        return super.getWidth();
    }

    @Override
    public int getHeight() {
        String sw = System.getenv("LINE");
        try {
        if( sw != null )
            return Integer.parseInt(sw);
        } catch( NumberFormatException e ){
            jline.internal.Log.trace("exeption parsing LNES variable", sw );
        }
        return super.getHeight();
    }

    @Override
    public synchronized boolean isEchoEnabled() {
        // TODO Auto-generated method stub
        return super.isEchoEnabled();
    }
    

}
