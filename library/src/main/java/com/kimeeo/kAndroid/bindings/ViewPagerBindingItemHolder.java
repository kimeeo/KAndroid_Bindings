package com.kimeeo.kAndroid.bindings;

import android.databinding.ViewDataBinding;
import android.view.View;

import com.kimeeo.kAndroid.listViews.pager.BaseItemHolder;

import java.util.Map;

/**
 * Created by bhavinpadhiyar on 3/9/16.
 */
public class ViewPagerBindingItemHolder<T extends ViewDataBinding> extends BaseItemHolder{

    private final Binding<T> binding;

    public ViewPagerBindingItemHolder(View itemView, int variableID) {
        super(itemView);
        binding = new Binding<T>(itemView,variableID);
        setVariables(getDefaultMap());
    }

    public ViewPagerBindingItemHolder(View itemView, Map<Integer, Object>  map) {
        super(itemView);
        binding = new Binding<T>(itemView,-1);
        setVariables(map);
        setVariables(getDefaultMap());
    }

    public ViewPagerBindingItemHolder(View itemView){
        this(itemView, -1);
    }

    protected Map<Integer, Object> getDefaultMap() {
        return null;
    }

    public T getBinding(){
        return binding.getBinding();
    }
    public void updateItemView(Object item, int position){
        setVariable(item);
        super.updateItemView(item, position);
    }

    @Override
    public void cleanView(View view, int i) {

    }

    public void updateItemView(Object data, View view, int position){

    }
    public void setVariables(Map<Integer,Object> data){
        binding.setVariables(data);
    }
    public void setVariable(Object data){
        binding.setVariable(data);
    }
    public void setVariable(int variableID,Object data) {
        binding.setVariable(variableID, data);
    }
    public View getView(int resID){
        return binding.getView(resID);
    }
}
