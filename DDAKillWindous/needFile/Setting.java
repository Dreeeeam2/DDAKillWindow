package src.DDAKillWindous.needFile;

import DDAKillWindous.DDAKillWinndous;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Setting extends JFrame {
    class  MyDiaog extends JDialog{
        public MyDiaog (Setting setting){
            super(setting,"help",true);
            Container container = getContentPane();
            container.add(new JLabel("系统版本号：DDASystem-ver2.1(beta)  \n"+"发行时间:2022,11,26\n   "+"是否有更新：false\n"));
            setBounds(0,0,100,100);
        }
    }
    public Setting(){
        setTitle("控制面板");
        Container c  = getContentPane();//主容器
        setLayout(null);//绝对布局
        setBounds(50,50,500,500);
        //=========================================
        JButton system = new JButton("系统信息");
        system.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Setting.MyDiaog diaog =new MyDiaog(Setting.this);
                diaog.setVisible(true);
            }
        });
        system.setBounds(0, 0 ,500,100);
//==============================================================
        JButton cmd  = new JButton("命令提示符");
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmnd = JOptionPane.showInputDialog(null,"请输入指令");
if(cmnd.equals("help")){
 JOptionPane.showConfirmDialog(null,"answer:查看当前用户", "命令提示符弹出的窗口" , JOptionPane.YES_NO_CANCEL_OPTION );
JOptionPane.showConfirmDialog(null,"config:查看此系统名称", "命令提示符弹出的窗口" , JOptionPane.YES_NO_CANCEL_OPTION );

}else if(cmnd.equals("answer")){
    JOptionPane.showConfirmDialog(null,"用户总数：2", "命令提示符弹出的窗口" , JOptionPane.YES_NO_CANCEL_OPTION );
    JOptionPane.showConfirmDialog(null,"无隐藏用户", "命令提示符弹出的窗口" , JOptionPane.YES_NO_CANCEL_OPTION );
    JOptionPane.showConfirmDialog(null,"用户列表：admin guest", "命令提示符弹出的窗口" , JOptionPane.YES_NO_CANCEL_OPTION );
    JOptionPane.showConfirmDialog(null,"当前用户：admin", "命令提示符弹出的窗口" , JOptionPane.YES_NO_CANCEL_OPTION );

}else if(cmnd.equals("config")){
    JOptionPane.showConfirmDialog(null,"当前系统名称：DDAKill(windows)-Beta", "命令提示符弹出的窗口" , JOptionPane.YES_NO_CANCEL_OPTION );
    JOptionPane.showConfirmDialog(null,"设备名：DDAW-B-CN-SD-01", "命令提示符弹出的窗口" , JOptionPane.YES_NO_CANCEL_OPTION );
}
            }
        });
        cmd.setBounds(0,100,500,100);
        //==============================================================================//命令提示符完成
        JButton call = new JButton("联系作者");
        call.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,"群号（钉钉）:25120005570", "命令提示符弹出的窗口" , JOptionPane.YES_NO_CANCEL_OPTION );
                JOptionPane.showConfirmDialog(null,"电话：18253603063", "命令提示符弹出的窗口" , JOptionPane.YES_NO_CANCEL_OPTION );
                JOptionPane.showConfirmDialog(null,"邮箱（钉钉）：x6i_b9xdlc5wj@dingtalk.com", "命令提示符弹出的窗口" , JOptionPane.YES_NO_CANCEL_OPTION );
            }
        });
        call.setBounds(0,200,500,100);
        //============================================================================//
        c.add(call);
        c.add(cmd);
        c.add(system);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}


