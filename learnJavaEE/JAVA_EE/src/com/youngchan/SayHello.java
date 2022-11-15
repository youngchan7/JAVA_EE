package com.youngchan;
/**
 * @author admin
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2022/11/12 12:27
 * @Description 生成选择图片展示的对话框
 */

import javax.swing.*;
import java.awt.*;
import java.io.File;


public class SayHello
{


	/**
	 * @return void
	 * @Author admin
	 * @Description //主函数
	 * @Date 0:00 2022/11/12
	 * @param    args
	 **/
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() ->
		{
			JFrame frame = new ImageViewerFrame();
			frame.setTitle("图片选择与展示");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}


class ImageViewerFrame extends JFrame
{
	private JLabel label;
	private JFileChooser chooser;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFALUT_HEIGHT = 400;

	public ImageViewerFrame()
	{
		setSize(DEFAULT_WIDTH, DEFALUT_HEIGHT);

		label = new JLabel();
		add(label);


		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);


		JMenu menu = new JMenu("选择");
		menuBar.add(menu);


		JMenuItem openItem = new JMenuItem("打开");
		menu.add(openItem);

		openItem.addActionListener(even ->
		{
			int result = chooser.showOpenDialog(null);

			if (result == JFileChooser.APPROVE_OPTION)
			{
				String name = chooser.getSelectedFile().getPath();
				label.setIcon(new ImageIcon(name));
			}
		});


		JMenuItem exitItem = new JMenuItem("关闭");
		menu.add(exitItem);

		exitItem.addActionListener(even -> System.exit(0));
	}
}

