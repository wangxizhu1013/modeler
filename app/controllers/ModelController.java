package controllers;

import java.util.ArrayList;
import java.util.List;

import com.avaje.ebean.Ebean;

import models.M_Domain;
import play.mvc.Controller;
import play.mvc.Result;
import utils.PinYin2Abbreviation;
import utils.Trans2PinYin;

/**
 * 模型管理Controller
 * @author 	wxz
 * @since 	2015-11-09
 * @version 1.0
 */
public class ModelController extends Controller{
	
	public Result home(){
		List<M_Domain> modelerlList = new ArrayList<M_Domain>();
		
		String str = "我爱北京天安门";
    	String pinyin = Trans2PinYin.getInstance().trans2PinYin(str);
    	
    	String pinyin_sx = PinYin2Abbreviation.cn2py(str);
		M_Domain m = new M_Domain();
		m.setName("Model1");
		m.setDescription("Model Description1");
		modelerlList.add(m);
		return ok(pinyin + "	||	" + pinyin_sx);
		//return ok(home.render(modelerlList));
	}
	
	public Result saveModeler(){
		M_Domain modeler = new M_Domain();
		Ebean.save(modeler);
		flash("success",
				String.format("Successfully added product %s", modeler));
		//return redirect(routes.ModelController.home());
        return null;
	}
	
	public String getUUID(String prefix,int flowLength){
		//从数据库查询编码信息
		
		return "";
	}
}
