package demoSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import javax.swing.border.LineBorder;

public class Swing extends JFrame {
	private JFrame frame = new JFrame("Graph");
	private JLabel label1 = new JLabel();
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private BoxLayout box1 = new BoxLayout(jp1, BoxLayout.Y_AXIS);
	private BoxLayout box2 = new BoxLayout(jp2, BoxLayout.X_AXIS);

	private ButtonGroup bg1 = new ButtonGroup();
	private ButtonGroup bg2 = new ButtonGroup();
	private ButtonGroup bg3 = new ButtonGroup();

	private JLabel labFile = new JLabel("File Test:  ");
	private String[] file = { "file 1", "file 2", "file 3", "file 4", "file 5", "file 6", "file 7", "file 8"};
	private JComboBox boxFile = new JComboBox(file);
	

	private JLabel labGraph = new JLabel("Graph");
	private JRadioButton rbDir = new JRadioButton("Directed Graph");
	private JRadioButton rbUndir = new JRadioButton("Undirected Graph");

	private JLabel labGraphType = new JLabel("Graph Type");
	private JRadioButton rbSingle = new JRadioButton("Single Graph");
	private JRadioButton rbMulti = new JRadioButton("Multi Graph");

	private JLabel labStartNode = new JLabel("Start Node");
	private JTextField text1 = new JTextField();
	private JLabel labEndNode = new JLabel("End Node");
	private JTextField text2 = new JTextField();

	private JLabel labAlgor = new JLabel("Algorithm Type");
	private JRadioButton rbloai1 = new JRadioButton("Dijkstra");
	private JRadioButton rbloai2 = new JRadioButton("Floyd");
	private JRadioButton rbloai3 = new JRadioButton("Bellman-Ford");

	private JButton butSearch = new JButton("Search");

	public Swing() {
		frame.add(jp1);
		frame.add(jp2);

		bg1.add(rbDir);
		bg1.add(rbUndir);
		labGraph.add(rbDir);
		labGraph.add(rbUndir);
		jp1.add(labGraph);
		jp1.add(rbDir);
		jp1.add(rbUndir);

		bg2.add(rbSingle);
		bg2.add(rbMulti);
		labGraphType.add(rbSingle);
		labGraphType.add(rbMulti);
		jp1.add(labGraphType);
		jp1.add(rbSingle);
		jp1.add(rbMulti);

		jp2.add(labFile, new FlowLayout());
		jp2.add(boxFile, new FlowLayout());
		boxFile.setBackground(Color.white);

		bg3.add(rbloai1);
		bg3.add(rbloai2);
		bg3.add(rbloai3);
		labAlgor.add(rbloai1);
		labAlgor.add(rbloai2);
		labAlgor.add(rbloai3);
		jp1.add(labAlgor);
		jp1.add(rbloai1);
		jp1.add(rbloai2);
		jp1.add(rbloai3);
		
		jp1.add(labStartNode);
		jp1.add(text1);
		jp1.add(labEndNode);
		jp1.add(text2);
		text1.setFont(new Font("Arial", Font.BOLD, 20));
		text2.setFont(new Font("Arial", Font.BOLD, 20));


		labGraph.setFont(new Font("Arial Nova", 20, 15));
		labGraphType.setFont(new Font("Arial Nova", 20, 15));
		labFile.setFont(new Font("Arial Nova", 20, 15));
		labStartNode.setFont(new Font("Arial Nova", 20, 15));
		labEndNode.setFont(new Font("Arial Nova", 20, 15));
		labAlgor.setFont(new Font("Arial Nova", 20, 15));
		butSearch.setFont(new Font("Arial Nova", 20, 15));

		butSearch.setBackground(Color.yellow);

		jp1.setBorder(LineBorder.createBlackLineBorder());
		jp2.setBorder(LineBorder.createBlackLineBorder());
		jp1.setLayout(box1);
		jp1.setBackground(Color.WHITE);

		jp2.add(butSearch,new GridLayout());
		jp2.add(label1);
		jp2.setBackground(Color.GRAY);
		
		add(jp2, BorderLayout.NORTH);
		add(label1, BorderLayout.CENTER);
		add(jp1, BorderLayout.WEST);
		
		
	}

	public static void main(String[] args) {
		Swing s = new Swing();
		s.setTitle("Graph");
		s.setVisible(true);
		s.setDefaultCloseOperation(EXIT_ON_CLOSE);
		s.setLocationRelativeTo(null);
		s.setSize(1000, 410);

	}

}
