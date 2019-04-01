import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Csv {
	public static class Entry{
		private ArrayList<String> items = new ArrayList<>();
		public void add(String e){
			items.add(e);
		}
		public String at(int i){
			return items.get(i);
		}
		public int length() {
			return items.size();
		}
	}

	// parseLine reads characters from a given StreamReader and gives a List of items for the whole csv file.
	public static List<Entry> parse(InputStreamReader reader) {
		String buffer = new String();
		int state = 0;
		char it;
		List<Entry> entries = new ArrayList<Entry>();
		Entry entry = new Entry();

		try {
			while (reader.ready()) {
				it = (char) reader.read();
				if (state == 2) {
					if (it == '"')
						state = 3;
					else
						buffer = buffer + it;
				}
				else {
					if (it == ',') {
						entry.add(buffer);
						buffer = "";
						state = 1;
					}
					else if (it == '\n') {
						if(state != 0) {
							entry.add(buffer);
							buffer = "";
						}
						entries.add(entry);
						entry = new Entry();
						state = 0;
					}
					else if (it == '"') {
						switch (state) {
						case 0:
						case 1: state = 2; break;
						case 3: buffer = buffer + it; state = 2; break;
						case 4: buffer = buffer + it; break;
						}
					}
					else {
						if (state == 3) {
							if (it != '\r')
								System.out.println("Csv.parse" + "CSV File corrupted and a character is removed.\n" + it);
						}
						else {
							buffer = buffer + it;
							state = 4;
						}
					}
				}
			}
			if (state != 0)
				entries.add(entry);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return entries;
	}
}
