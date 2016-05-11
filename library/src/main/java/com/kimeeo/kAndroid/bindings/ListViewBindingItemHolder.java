package com.kimeeo.kAndroid.bindings;

import android.databinding.ViewDataBinding;
import android.view.View;

import com.kimeeo.kAndroid.listViews.listView.BaseItemHolder;

import java.util.Map;

/**
 * Created by bhavinpadhiyar on 3/9/16.
 */
public class ListViewBindingItemHolder<T extends ViewDataBinding> extends BaseItemHolder{

    private final Binding<T> binding;

    public ListViewBindingItemHolder(View itemView, int variableID) {
        super(itemView);
        binding = new Binding<T>(itemView,variableID);
        setVariables(getDefaultMap());
    }

    public ListViewBindingItemHolder(View itemView, Map<Integer, Object>  map) {
        super(itemView);
        binding = new Binding<T>(itemView,-1);
        setVariables(map);
        setVariables(getDefaultMap());
    }

    public ListViewBindingItemHolder(View itemView){
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
    public void updateItemView(Object data, View view, int position){}

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
