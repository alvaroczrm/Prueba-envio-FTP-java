package es.studium.PruebaFTP;

import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.ftp.FTPClient;

public class ClienteFTP1 {
	public static void main(String[] args) {
		try {
			FTPClient cliente = new FTPClient();
			String servFTP = "ftp.rediris.es"; // Servidor FTP
			System.out.println("Nos conectamos a: " + servFTP);
			cliente.connect(servFTP);
// Respuesta del servidor FTP
			System.out.print(cliente.getReplyString());
// C�digo de respuesta
			int respuesta = cliente.getReplyCode();
// Comprobaci�n del c�digo de respuesta
			if (!FTPReply.isPositiveCompletion(respuesta)) {
				cliente.disconnect();
				System.out.println("Conexi�n rechazada: " + respuesta);
				System.exit(0);
			} else {
// Desconexi�n del servidor FTP
				cliente.disconnect();
				System.out.println("Conexi�n finalizada.");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}