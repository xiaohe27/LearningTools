import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static CharSequence fromFile(String filename) throws IOException {
    FileInputStream fis = new FileInputStream(filename);
    FileChannel fc = fis.getChannel();

    // Create a read-only CharBuffer on the file
    ByteBuffer bbuf = fc.map(FileChannel.MapMode.READ_ONLY, 0, (int) fc.size());
    CharBuffer cbuf = Charset.forName("8859_1").newDecoder().decode(bbuf);
    return cbuf;
  }

  public static void main(String[] argv) throws Exception {
    // Create matcher on file
    Pattern pattern = Pattern.compile("pattern");
    Matcher matcher = pattern.matcher(fromFile("infile.txt"));

    // Find all matches
    while (matcher.find()) {
      // Get the matching string
      String match = matcher.group();
    }
  }
}
