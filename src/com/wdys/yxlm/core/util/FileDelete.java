package com.wdys.yxlm.core.util;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdys.yxlm.domain.Picture;
import com.wdys.yxlm.service.PictureService;

@Service
@Transactional
public class FileDelete {/*extends TimerTask {
	
	@Autowired
	private static PictureService pictureService;
	
	private static final String targetPath1 = "C:\\Users\\Administrator\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\yxlm\\upload\\story"; 
    private static final String targetPath2 = "C:\\Users\\Administrator\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\yxlm\\upload"; 
    private Timer timer = new Timer(); 
     
    private Calendar calendar = Calendar.getInstance(); 
    public static void main(String[] args) { 
        FileDelete fm = new FileDelete(); 
        fm.start(); 
    } 
    private static void delFiles(String[] dir) { 
        for (int i = 0; i < dir.length; i++) { 
            File f = new File(dir[i]); 
            File[] files = null; 
            if (f.exists()) { 
                files = f.listFiles(); 
                for (int j = 0; j < files.length; j++) { 
                List<String>  pictureImgs=	pictureService.findByPictureImg();
                for(String pictureImg:pictureImgs){
                	if(files[j].getAbsolutePath()== pictureImg){
                		continue;
                	}else{
                		files[j].delete(); 
                	}
                	}
                }   
                
            } 
        } 
    } 
    public void start() { 
        
        timer.scheduleAtFixedRate(this, new Date(), 1000 * 10 * 60);//10分钟转化为毫秒         
    } 
    public void run() {         
        delFiles(new String[] { targetPath1, targetPath2 });     
        //在每天的23:30后不再执行
        if(calendar.get(Calendar.HOUR_OF_DAY) ==23 && calendar.get(Calendar.MINUTE) == 30){ 
            this.cancel(); 
        } 
    } */
}
