package br.salvavidas.api.config;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.salvavidas.api.model.Salvavidas;
import br.salvavidas.api.repository.CultoRepository;
import br.salvavidas.api.repository.SalvavidasRepository;

@Component
public class BootstrapData {

	private static final Logger log = LoggerFactory.getLogger(BootstrapData.class);

	private final SalvavidasRepository salvavidasRepository;
	private final CultoRepository cultoRepository;
	private final Boolean fakeData;



	public BootstrapData(SalvavidasRepository usuarioRepository, CultoRepository cultoRepository, @Value("${modelo.fakedata:false}") Boolean fakeData) {
		this.salvavidasRepository = usuarioRepository;
		this.cultoRepository = cultoRepository;
		this.fakeData = fakeData;
	}

	@EventListener
	public void onApplicationRefresh(ContextRefreshedEvent event) {
		if(fakeData) {
			log.info("Inserindo dados fake de dev...");

			List<String> lista = new ArrayList<>();
			lista.add("Adrienny Gonçalves de Couto                       ");
			lista.add("Acácio dos Santos Saltro                          ");
			lista.add("Alefer Monteiro de Souza                          ");
			lista.add("Aline Gonçalves Ferreira                          ");
			lista.add("Ana Cristina Inácio Alves                         ");
			lista.add("Breno Barretos Lopes                              ");
			lista.add("Breno Célio                                       ");
			lista.add("Calebe Nogueira                                   ");
			lista.add("Camila Aguiar Rodrigues                           ");
			lista.add("Carla Duarte Silva                                ");
			lista.add("Carolina Duarte Miranda                           ");
			lista.add("Caroline Gomes Lopes                              ");
			lista.add("Claudia T. Silva                                  ");
			lista.add("Cristiano Marques Duarte                          ");
			lista.add("Dalila do Nascimento Gregório                     ");
			lista.add("Danielle Antoniazzi                               ");
			lista.add("Davi Emanuel de Sousa Gonçalves                   ");
			lista.add("Dayane Gomes Costa                                ");
			lista.add("Dayane Jardim                                     ");
			lista.add("Débora Cristina Meira da Silva Barbosa            ");
			lista.add("Débora Martins                                    ");
			lista.add("Diego Gabriel de Souza Marcondes                  ");
			lista.add("Diego Pedro Santos Saraiva                        ");
			lista.add("Edna Teixeira Lopes                               ");
			lista.add("Ester Ramos                                       ");
			lista.add("Evandro Claudino Junior                           ");
			lista.add("Evandro Rox Igino                                 ");
			lista.add("Fabrini Cypriano Chagas                           ");
			lista.add("Felipe Aparecido Amaral                           ");
			lista.add("Felipe Miranda Silva                              ");
			lista.add("Fernanda Miranda de Carvalho                      ");
			lista.add("Fernanda Reis                                     ");
			lista.add("Flávia Fabiana Pena                               ");
			lista.add("Francisco Junio Quirino Anastácio                 ");
			lista.add("Gabriel Henrique Costa                            ");
			lista.add("Gabriella Larissa Souza                           ");
			lista.add("Graziele Pimenta da Silva                         ");
			lista.add("Guilherme Ferreira de Freitas                     ");
			lista.add("Gutenberg Santos da Silva                         ");
			lista.add("Hugo Silva de Matos                               ");
			lista.add("Isabela Marise Taveira Coelho                     ");
			lista.add("Jéssica Alves Pereira                             ");
			lista.add("Jéssica Lorraine Damasio                          ");
			lista.add("João Marcos Durães Vieira                         ");
			lista.add("José Lourenço da Silva                            ");
			lista.add("Josenildo Junior                                  ");
			lista.add("Juliene Alana de Souza                            ");
			lista.add("Karine Coutinho                                   ");
			lista.add("Keila Santana                                     ");
			lista.add("Késsia de Oliveira Dias dos Santos                ");
			lista.add("Keytson Batista                                   ");
			lista.add("Larissa Scortegagni                               ");
			lista.add("Larissa Tavares Lisboa                            ");
			lista.add("Leonardo Souza                                    ");
			lista.add("Leticia Reis de Souza                             ");
			lista.add("Luana Cordeiro Silva                              ");
			lista.add("Lucas Abilio Frade                                ");
			lista.add("Lucas Ribeiro dos Santos                          ");
			lista.add("Luiz Fernando Braz de Oliveira                    ");
			lista.add("Luiz Henrique Oliveira Elpidio                    ");
			lista.add("Lyon Luan Souza                                   ");
			lista.add("Magno Horta                                       ");
			lista.add("Marcos Totte Junior                               ");
			lista.add("Marcos Tulio da Cruz                              ");
			lista.add("Marcus Vinícius Silva de Freitas                  ");
			lista.add("Maria Bethânia Pires                              ");
			lista.add("Maria Isabel Xavier de Ornelas                    ");
			lista.add("Maria Luíza Tanos dos Santos                      ");
			lista.add("Marina Eduarda Dos Santos Gomes                   ");
			lista.add("Matheus Augusto Alves Xavier                      ");
			lista.add("Matheus Cunha Nicolini                            ");
			lista.add("Matheus Lourenço Alves da Silva                   ");
			lista.add("Matheus Rodrigues Paixão                          ");
			lista.add("Mauro Santos de Oliveira                          ");
			lista.add("Miguel Victor Araújo                              ");
			lista.add("Naiara dos Santos Araújo                          ");
			lista.add("Natália de Jesus Eduardo                          ");
			lista.add("Nayara Diniz da Silva                             ");
			lista.add("Nilciomario Boari                                 ");
			lista.add("Pamela Carolina Antunes de Souza                  ");
			lista.add("Patrick Felipe Pires                              ");
			lista.add("Paulo Nogueira Pereira                            ");
			lista.add("Pedro Henrique da Cruz                            ");
			lista.add("Poliane Cardoso de Oliveira                       ");
			lista.add("Rachell Rocha Faria Guimarães                     ");
			lista.add("Rafael Almeida Campos                             ");
			lista.add("Rafael Almeida do Carmo                           ");
			lista.add("Rafael Augusto Santos de Souza                    ");
			lista.add("Rafael Henrique de Souza Gonçalves                ");
			lista.add("Rebeca Tábita Seabra Leão                         ");
			lista.add("Rebecca Viana Santos                              ");
			lista.add("Renan Ribeiro Santos Flores                       ");
			lista.add("Renato Neves Vieira de Andrade                    ");
			lista.add("Rodrigo Cesar Fernandes                           ");
			lista.add("Ronieli Marques da Costa                          ");
			lista.add("Sâmella Thamara de Abreu Ribeiro                  ");
			lista.add("Sarah Julie da Cruz                               ");
			lista.add("Stéfanie Soares de Paula                          ");
			lista.add("Stefany Helena da Silva                           ");
			lista.add("Talita Alves Muneron                              ");
			lista.add("Tayanne Campos Pujoni                             ");
			lista.add("Thaís Fernandes Santos                            ");
			lista.add("Thaís Karine de Cristo                            ");
			lista.add("Thales Augusto de Oliveira Moreira                ");
			lista.add("Thales Silva Duarte                               ");
			lista.add("Thamara Fialho                                    ");
			lista.add("Thiago Henrique Amaral Lima                       ");
			lista.add("Thiago Perrelli Avelar Lima                       ");
			lista.add("Tiago Amaro de Souza                              ");
			lista.add("Tiago Andre                                       ");
			lista.add("Vinícius Coelho de Souza                          ");
			lista.add("Vinícius Rocha                                    ");
			lista.add("Vivian                                            ");
			lista.add("Viviane Dean Afonso                               ");
			lista.add("Wallison Matheus                                  ");
			lista.add("Willian Melquíades                                ");


			int x = 1;
			for (String sv : lista){
				salvavidasRepository.save(new Salvavidas().setIdImagem(String.valueOf(x++)).setNome(sv.trim()));
			}

			/*Salvavidas sv1 = new Salvavidas().setIdImagem("1").setNome("Adrienny Gonçalves de Couto");
			Salvavidas sv2 = new Salvavidas().setIdImagem("2").setNome("Alefer Monteiro de Souza");
			Salvavidas sv3 = new Salvavidas().setIdImagem("3").setNome("Aline Gonçalves Ferreira");
			Salvavidas sv4 = new Salvavidas().setIdImagem("4").setNome("Ana Cristina Inácio Alves");
			Salvavidas sv5 = new Salvavidas().setIdImagem("5").setNome("Breno Célio");
			Salvavidas sv6 = new Salvavidas().setIdImagem("6").setNome("Breno Barretos Lopes");

			Salvavidas sv7 = new Salvavidas().setIdImagem("7").setNome("Calebe Nogueira");
			Salvavidas sv8 = new Salvavidas().setIdImagem("8").setNome("Carolina Duarte Miranda");
			Salvavidas sv9 = new Salvavidas().setIdImagem("9").setNome("Caroline Gomes Lopes");
			Salvavidas sv10 = new Salvavidas().setIdImagem("10").setNome("Claudia T. Silva");
			Salvavidas sv11 = new Salvavidas().setIdImagem("11").setNome("Dayane Gomes Costa");
			Salvavidas sv12 = new Salvavidas().setIdImagem("12").setNome("Débora Cristina Meira da Silva Barbosa");
			Salvavidas sv13 = new Salvavidas().setIdImagem("13").setNome("Ester Ramos");
			Salvavidas sv14 = new Salvavidas().setIdImagem("14").setNome("Fernanda Miranda de Carvalho");
			Salvavidas sv15 = new Salvavidas().setIdImagem("15").setNome("Fernanda Reis");
			Salvavidas sv16 = new Salvavidas().setIdImagem("16").setNome("Gabriella Larissa Souza");
			Salvavidas sv17 = new Salvavidas().setIdImagem("17").setNome("Hugo Silva de Matos");
			Salvavidas sv18 = new Salvavidas().setIdImagem("18").setNome("Isabela Marise Taveira Coelho");
			Salvavidas sv19 = new Salvavidas().setIdImagem("19").setNome("João Gomes");


			salvavidasRepository.save(sv1);
			salvavidasRepository.save(sv2);
			salvavidasRepository.save(sv3);
			salvavidasRepository.save(sv4);
			salvavidasRepository.save(sv5);
			salvavidasRepository.save(sv6);
			salvavidasRepository.save(sv7);
			salvavidasRepository.save(sv8);
			salvavidasRepository.save(sv9);
			salvavidasRepository.save(sv10);
			salvavidasRepository.save(sv11);
			salvavidasRepository.save(sv12);
			salvavidasRepository.save(sv13);
			salvavidasRepository.save(sv14);
			salvavidasRepository.save(sv15);
			salvavidasRepository.save(sv16);
			salvavidasRepository.save(sv17);
			salvavidasRepository.save(sv18);
			salvavidasRepository.save(sv19);*/

			/*Culto c1 = new Culto().setData(new Date()).setTipo("0Caixa");
			Set<Presenca> p1 = new HashSet<>();
			p1.add(new Presenca().setSalvavidas(sv1).setPresente(true).setCulto(c1));
			p1.add(new Presenca().setSalvavidas(sv2).setPresente(false).setCulto(c1));
			p1.add(new Presenca().setSalvavidas(sv3).setPresente(true).setCulto(c1));
			p1.add(new Presenca().setSalvavidas(sv4).setPresente(true).setCulto(c1));
			p1.add(new Presenca().setSalvavidas(sv5).setPresente(false).setCulto(c1));
			p1.add(new Presenca().setSalvavidas(sv6).setPresente(true).setCulto(c1));
			c1.setPresenca(p1);

			Culto c2 = new Culto().setData(new Date()).setTipo("_Terca");
			Set<Presenca> p2 = new HashSet<>();
			p2.add(new Presenca().setSalvavidas(sv1).setPresente(false).setCulto(c2));
			p2.add(new Presenca().setSalvavidas(sv2).setPresente(false).setCulto(c2));
			p2.add(new Presenca().setSalvavidas(sv3).setPresente(false).setCulto(c2));
			p2.add(new Presenca().setSalvavidas(sv4).setPresente(true).setCulto(c2));
			p2.add(new Presenca().setSalvavidas(sv5).setPresente(false).setCulto(c2));
			p2.add(new Presenca().setSalvavidas(sv6).setPresente(true).setCulto(c2));
			c2.setPresenca(p2);*/

			//cultoRepository.save(c1);
			//cultoRepository.save(c2);

		}		
	}

	public static void main(String[] args) throws Exception {
		
		
		File dir = new File("E:\\temp\\avatar\\originais");
		for (File arq : dir.listFiles()){
			if (arq.getName().startsWith("f")){
				redimensionar(arq);
			}
		}
	}

	private static void redimensionar(File arquivo) throws IOException {
		BufferedImage imagem = null;
		try {
			imagem = ImageIO.read(arquivo);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		int new_w = 100, new_h = 100;
		BufferedImage new_img = new BufferedImage(new_w, new_h, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = new_img.createGraphics();
		g.drawImage(imagem, 0, 0, new_w, new_h, null);
		ImageIO.write(new_img, "JPG", new File("E:\\temp\\avatar\\red\\"+arquivo.getName()));
	}

}
