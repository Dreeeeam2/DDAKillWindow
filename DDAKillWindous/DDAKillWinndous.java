package DDAKillWindous;

import src.DDAKillWindous.needFile.Setting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.*;
import java.util.Base64;

public class DDAKillWinndous extends JFrame {
    class  MyDiaog extends JDialog{
        public MyDiaog (DDAKillWinndous winndous){
            super(winndous,"help",true);
            Container container = getContentPane();
            container.add(new JLabel("jsq：计算\");\n" +
                    "qh：切换用户\");\n" +
                    "PingTool:扫描工具\")\n" +
                    "exit:退出\");\n" +
                    "URL:爬虫\");\n" +
                    "wz:文件存储\");\n" +
                    "install:下载\");\n" +
                    "BASE64:加密\");\n" +
                    "BASE64jm:解密\");\n" +
                    "notepad: 记事本\");\n" +
                    "write:文件内容写入\");\n" +
                    "read:读取文件内容\" );"));
            setBounds(120,120,100,100);
        }
    }
    public DDAKillWinndous(){
setTitle("DDA   KILL  WINDOWS");
        Container c  = getContentPane();//主容器
        setLayout(null);//绝对布局
        setBounds(50,50,1000,800);
        //==========================================//
        JButton jsq  = new JButton("计算器");

        jsq.addActionListener(new ActionListener() {//计算器触发程序
            @Override
            public void actionPerformed(ActionEvent e) {
         int  num1;
         String num1s=        JOptionPane.showInputDialog(null,"请输入第一个数字") ;
         num1=Integer.parseInt(num1s);//第一个数字完成赋值
                int  num2;
                String num2s=        JOptionPane.showInputDialog(null,"请输入第二个数字") ;
                num2=Integer.parseInt(num2s);//第2个数字完成赋值

                int answer = JOptionPane.showConfirmDialog(null, (num1+num2),"计算器弹出的窗口(num1+num2)" , JOptionPane.YES_NO_CANCEL_OPTION );
                int answer2 = JOptionPane.showConfirmDialog(null, (num1-num2),"计算器弹出的窗口(num1-num2)" , JOptionPane.YES_NO_CANCEL_OPTION );
                int answer3 = JOptionPane.showConfirmDialog(null, (num1*num2),"计算器弹出的窗口(num1*num2)" , JOptionPane.YES_NO_CANCEL_OPTION );
                int answer4 = JOptionPane.showConfirmDialog(null, (num1/num2),"计算器弹出的窗口(num1/num2)" , JOptionPane.YES_NO_CANCEL_OPTION );
            }

        });

        jsq.setBounds(10,30,80,30);
        //================================计算器完成//
        JButton help =  new JButton("help");//help
                help.addActionListener(new ActionListener() {//程序
                    @Override
                    public void actionPerformed(ActionEvent e) {
MyDiaog  diaog = new MyDiaog(DDAKillWinndous.this);
diaog.setVisible(true);

                    }
                });
                help.setBounds(10,70,80,30);//设置大小
//=======================================帮助完成//
        JButton  Pingtool = new JButton("扫描工具");
        Pingtool.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String target = JOptionPane.showInputDialog(null,"请输入目标网址");
                try {
                    InetAddress inetAddress = InetAddress.getByName(target);
                    JOptionPane.showConfirmDialog(null,inetAddress,"target",JOptionPane.YES_NO_CANCEL_OPTION);
                } catch (UnknownHostException ex) {
              ex.printStackTrace();
                }
            }
        });
Pingtool.setBounds(10 ,110,110,30);
//====================================扫描工具完成//
JButton   BASE64 = new JButton("BASE64加密");//base64
BASE64.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String doc = JOptionPane.showInputDialog(null,"请输入要加密的文字" );
        Base64.Encoder encoder = Base64.getEncoder();//编码器
        String ciphertext = encoder.encodeToString(doc.getBytes());
        JOptionPane.showConfirmDialog(null,ciphertext,"密文",JOptionPane.YES_NO_CANCEL_OPTION);

    }

});
BASE64.setBounds(10,150,120,30);
//==========================================base64加密//
        JButton jm = new JButton("base64解密");
        jm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jdoc = JOptionPane.showInputDialog(null,"请输入要解密的文字" );
                Base64.Decoder decoder = Base64.getDecoder();//解码器
                byte[] Plaintext = decoder.decode(jdoc);
                String k = new String(Plaintext);
                JOptionPane.showConfirmDialog(null,k,"明文",JOptionPane.YES_NO_CANCEL_OPTION);
            }
        });
        jm.setBounds(10,190,120,30);
//==================================================base64解密
        JButton writefile = new JButton("文件存储");
        writefile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String path = JOptionPane.showInputDialog(null,"请输入文件路径" );
                File file = new File(path);
                if(file.exists()){
                    file.delete();
                    JOptionPane.showConfirmDialog(null,"文件已删除","message",JOptionPane.YES_NO_CANCEL_OPTION);
                }else{
                    try {
                        file.createNewFile();
                        JOptionPane.showConfirmDialog(null,"文件已创建","message",JOptionPane.YES_NO_CANCEL_OPTION);
                    }catch (IOException e1){
                        e1.printStackTrace();
                    }
                }
            }

        });
        writefile.setBounds(10,230,120,30);
        //==================================================================//文件创
        JButton filein = new JButton("文件内容写入");
        filein.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String path =  JOptionPane.showInputDialog(null,"请输入文件路径" );
                File file= new File(path);
                try{
                    FileWriter fw = new FileWriter(file);
                    String word = JOptionPane.showInputDialog(null,"请输入你要写入的内容");
                    fw.write(word);
                    fw.close();
                    JOptionPane.showConfirmDialog(null,"内容已写入成功","message",JOptionPane.YES_NO_CANCEL_OPTION);
                }catch (IOException e2){
                    e2.printStackTrace();
                }
            }
        });
filein.setBounds(10,270,120,30);
        //============================================文件写入结束//
        JButton sendmsg = new JButton("DDOS");
        sendmsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    DatagramSocket socket = new DatagramSocket();
                    String msg = JOptionPane.showInputDialog(null,"请输入你要发送的内容");
                    String target = JOptionPane.showInputDialog(null,"请输入要发信息的网站" );
                    String cs = JOptionPane.showInputDialog(null,"请输入发送的次数" );
                    int csi = Integer.parseInt(cs);
                    InetAddress inetAddress = InetAddress.getByName(target);
                    int port = 8080;


                    for (int i = 0; i <= csi ; i++) {

                        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, inetAddress, port);
                        socket.send(datagramPacket);
                    }
                    socket.close();


                } catch (SocketException ex) {
                    throw new RuntimeException(ex);
                } catch (UnknownHostException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        sendmsg.setBounds(10,310,120,30);
//===================================================================//发送信息完成（beta）
        JButton setting = new JButton("控制面板");
        setting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
new Setting();
            }
        });
setting.setBounds(10,350,120,30);
//\==============================================================//控制面板
        c.add(setting);
        c.add(sendmsg);
        c.add(filein);
        c.add(writefile);
c.add(Pingtool);
c.add(BASE64);
c.add(jm);
        c.add(jsq);//添加计算器
        c.add(help);//add hepl
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DDAKillWinndous();
    }



}
