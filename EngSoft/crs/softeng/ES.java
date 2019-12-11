package softeng;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class ES {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private DefaultTableModel model1;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_3;
	private File excel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ES window = new ES();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ES() {
		initialize();
		addTableHeader();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(200, 200, 800, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 0, 131, 176, 0, 0, 118, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 58, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);

		model1 = new DefaultTableModel();

		JLabel lblAvaliaoDaQualidade = new JLabel("Avalia\u00E7\u00E3o da Qualidade na Dete\u00E7\u00E3o de Erros");
		lblAvaliaoDaQualidade.setForeground(new Color(0, 0, 255));
		GridBagConstraints gbc_lblAvaliaoDaQualidade = new GridBagConstraints();
		gbc_lblAvaliaoDaQualidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblAvaliaoDaQualidade.gridx = 3;
		gbc_lblAvaliaoDaQualidade.gridy = 0;
		frame.getContentPane().add(lblAvaliaoDaQualidade, gbc_lblAvaliaoDaQualidade);


		JButton btnMostrarExcel = new JButton("Mostrar Excel");
		btnMostrarExcel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//File excel;
				FileInputStream excelfis = null;
				BufferedInputStream excelbis = null;
				XSSFWorkbook excelJPanelImport = null;

				String path = "C:\\Users\\beaab\\OneDrive\\Ambiente de Trabalho\\excel";
				JFileChooser jf = new JFileChooser(path);
				int excelchooser = jf.showOpenDialog(null);


				if (excelchooser == JFileChooser.APPROVE_OPTION) {

					excel = jf.getSelectedFile();

					try {
						excelfis = new FileInputStream(excel);
						excelbis = new BufferedInputStream(excelfis);

						excelJPanelImport = new XSSFWorkbook(excelbis);
						XSSFSheet sheet = excelJPanelImport.getSheetAt(0);

						for (int linha = 0; linha < sheet.getLastRowNum(); linha++) {
							XSSFRow excellinha = sheet.getRow(linha);

							XSSFCell excelMethodID = excellinha.getCell(0);
							XSSFCell excelpackage = excellinha.getCell(1);
							XSSFCell excelClassExcel = excellinha.getCell(2);
							XSSFCell excelmethod = excellinha.getCell(3);
							XSSFCell excelLOC = excellinha.getCell(4);
							XSSFCell excelCYCLO = excellinha.getCell(5);
							XSSFCell excelATFD = excellinha.getCell(6);
							XSSFCell excelLAA = excellinha.getCell(7);
							XSSFCell excelis_long_method = excellinha.getCell(8);
							XSSFCell exceliPlasma = excellinha.getCell(9);
							XSSFCell excelPMD = excellinha.getCell(10);
							XSSFCell excelis_feature_envy = excellinha.getCell(11);

//							System.out.println(excelMethodID);
//							System.out.println(excelpackage);
//							System.out.println(excelClassExcel);
//							System.out.println(excelmethod);
//							System.out.println(excelLOC);
//							System.out.println(excelCYCLO);
//							System.out.println(excelATFD);
//							System.out.println(excelLAA);
//							System.out.println(excelis_long_method);
//							System.out.println(exceliPlasma);
//							System.out.println(excelPMD);
//							System.out.println(excelis_feature_envy);

							model1.addRow(new Object[] { excelMethodID, excelpackage, excelClassExcel, excelmethod, excelLOC, excelCYCLO, excelATFD, excelLAA, excelis_long_method, exceliPlasma, excelPMD, excelis_feature_envy});


							//							for (int coluna = 0; coluna < excellinha.getLastCellNum(); coluna++) {
								//								XSSFCell excelcell = excellinha.getCell(coluna);
							//								switch (excelcell.getCellType()) 
							//				                {
							//				                	case NUMERIC:
							//				                        System.out.println(excelcell.getNumericCellValue() + "    ");
							//				                        break;
							//				                    case STRING:
							//				                        System.out.println(excelcell.getStringCellValue() + "    ");
							//				                        break;
							//				                    case BOOLEAN:
							//				                        System.out.println(excelcell.getBooleanCellValue() + "    ");
							//				                        break;
							//				                }
							//							}
						}
					} catch (FileNotFoundException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
				}
			}
		});
		btnMostrarExcel.setForeground(Color.BLUE);
		GridBagConstraints gbc_btnMostrarExcel = new GridBagConstraints();
		gbc_btnMostrarExcel.insets = new Insets(0, 0, 5, 5);
		gbc_btnMostrarExcel.gridx = 2;
		gbc_btnMostrarExcel.gridy = 2;
		frame.getContentPane().add(btnMostrarExcel, gbc_btnMostrarExcel);

		JButton btnAvaliarPmd = new JButton("Avaliar PMD");
		btnAvaliarPmd.setBackground(Color.CYAN);
		GridBagConstraints gbc_btnAvaliarPmd = new GridBagConstraints();
		gbc_btnAvaliarPmd.insets = new Insets(0, 0, 5, 5);
		gbc_btnAvaliarPmd.gridx = 3;
		gbc_btnAvaliarPmd.gridy = 2;
		frame.getContentPane().add(btnAvaliarPmd, gbc_btnAvaliarPmd);

		JButton btnAvaliarIplasma = new JButton("Avaliar iPlasma");
		btnAvaliarIplasma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AvQualidade av = new AvQualidade();
				try {
					av.iPlasma(excel);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				av.is_long_method(model1);

			}
		});
		btnAvaliarIplasma.setBackground(Color.CYAN);
		GridBagConstraints gbc_btnAvaliarIplasma = new GridBagConstraints();
		gbc_btnAvaliarIplasma.insets = new Insets(0, 0, 5, 5);
		gbc_btnAvaliarIplasma.gridx = 6;
		gbc_btnAvaliarIplasma.gridy = 2;
		frame.getContentPane().add(btnAvaliarIplasma, gbc_btnAvaliarIplasma);

		JLabel lblInsiraUmaNova = new JLabel("Insira uma nova regra :) ");
		lblInsiraUmaNova.setForeground(Color.BLUE);
		GridBagConstraints gbc_lblInsiraUmaNova = new GridBagConstraints();
		gbc_lblInsiraUmaNova.insets = new Insets(0, 0, 5, 5);
		gbc_lblInsiraUmaNova.gridx = 2;
		gbc_lblInsiraUmaNova.gridy = 4;
		frame.getContentPane().add(lblInsiraUmaNova, gbc_lblInsiraUmaNova);

		JLabel lblLoc = new JLabel("LOC");
		GridBagConstraints gbc_lblLoc = new GridBagConstraints();
		gbc_lblLoc.insets = new Insets(0, 0, 5, 5);
		gbc_lblLoc.gridx = 0;
		gbc_lblLoc.gridy = 6;
		frame.getContentPane().add(lblLoc, gbc_lblLoc);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<", ">", "<=", ">="}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 6;
		frame.getContentPane().add(comboBox_1, gbc_comboBox_1);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 6;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblAnd = new JLabel("AND");
		GridBagConstraints gbc_lblAnd = new GridBagConstraints();
		gbc_lblAnd.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnd.gridx = 3;
		gbc_lblAnd.gridy = 6;
		frame.getContentPane().add(lblAnd, gbc_lblAnd);

		JLabel lblCyclo = new JLabel("CYCLO");
		GridBagConstraints gbc_lblCyclo = new GridBagConstraints();
		gbc_lblCyclo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCyclo.gridx = 4;
		gbc_lblCyclo.gridy = 6;
		frame.getContentPane().add(lblCyclo, gbc_lblCyclo);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"<", ">", "<=", ">="}));
		GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
		gbc_comboBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_5.gridx = 5;
		gbc_comboBox_5.gridy = 6;
		frame.getContentPane().add(comboBox_5, gbc_comboBox_5);

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 6;
		gbc_textField_1.gridy = 6;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel lblAtfd = new JLabel("ATFD");
		GridBagConstraints gbc_lblAtfd = new GridBagConstraints();
		gbc_lblAtfd.insets = new Insets(0, 0, 5, 5);
		gbc_lblAtfd.anchor = GridBagConstraints.EAST;
		gbc_lblAtfd.gridx = 0;
		gbc_lblAtfd.gridy = 8;
		frame.getContentPane().add(lblAtfd, gbc_lblAtfd);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"<", ">", "<=", ">="}));
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 1;
		gbc_comboBox_4.gridy = 8;
		frame.getContentPane().add(comboBox_4, gbc_comboBox_4);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 8;
		frame.getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblAnd_1 = new JLabel("AND");
		GridBagConstraints gbc_lblAnd_1 = new GridBagConstraints();
		gbc_lblAnd_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnd_1.gridx = 3;
		gbc_lblAnd_1.gridy = 8;
		frame.getContentPane().add(lblAnd_1, gbc_lblAnd_1);

		JLabel lblLaa = new JLabel("LAA");
		GridBagConstraints gbc_lblLaa = new GridBagConstraints();
		gbc_lblLaa.anchor = GridBagConstraints.EAST;
		gbc_lblLaa.insets = new Insets(0, 0, 5, 5);
		gbc_lblLaa.gridx = 4;
		gbc_lblLaa.gridy = 8;
		frame.getContentPane().add(lblLaa, gbc_lblLaa);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<", ">", "<=", ">="}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 5;
		gbc_comboBox.gridy = 8;
		frame.getContentPane().add(comboBox, gbc_comboBox);

		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 6;
		gbc_textField_3.gridy = 8;
		frame.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
				
				JButton btnDetetarDefeitoDas = new JButton("Detetar defeito das novas regras");
				btnDetetarDefeitoDas.setBackground(Color.CYAN);
				GridBagConstraints gbc_btnDetetarDefeitoDas = new GridBagConstraints();
				gbc_btnDetetarDefeitoDas.insets = new Insets(0, 0, 5, 5);
				gbc_btnDetetarDefeitoDas.gridx = 2;
				gbc_btnDetetarDefeitoDas.gridy = 10;
				frame.getContentPane().add(btnDetetarDefeitoDas, gbc_btnDetetarDefeitoDas);
		
				JButton btnAvaliarNovasRegras = new JButton("Avaliar novas regras");
				btnAvaliarNovasRegras.setBackground(Color.CYAN);
				GridBagConstraints gbc_btnAvaliarNovasRegras = new GridBagConstraints();
				gbc_btnAvaliarNovasRegras.insets = new Insets(0, 0, 5, 5);
				gbc_btnAvaliarNovasRegras.gridx = 6;
				gbc_btnAvaliarNovasRegras.gridy = 10;
				frame.getContentPane().add(btnAvaliarNovasRegras, gbc_btnAvaliarNovasRegras);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 6;
		gbc_scrollPane.gridwidth = 6;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 12;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);



		table.setModel(new javax.swing.table.DefaultTableModel(
				new Object [][] {

				},
				new String [] {
						"null"
				}
				));
	}
	public void addTableHeader() {
		model1 = (DefaultTableModel) table.getModel();
		Object[] newIdentifiers = new Object[]{"MethodoID", "Package", "Class", "method", "LOC", "CYCLO", "ATFD", "LAA", "is_long_method", "iPlasma", "PMD", "is_feature_envy"};
		model1.setColumnIdentifiers(newIdentifiers);
	}

}
