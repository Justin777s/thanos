package org.justin.thanos.fragment;

import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thanos.android.core.base.CoreBaseFragment;

import org.justin.thanos.R;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: <／p>
 * <p>Description: <／p>
 * <p>Copyright: Copyright (c) 2016<／p>
 * <p>Company: NetDragon<／p>
 *
 * @author Justin
 * @version 2017/3/22
 */
public class MainListFrag extends CoreBaseFragment implements MyItemClickListener{
    private static final String TAG = "MainListFrag";



    private RecyclerView mRecyclerView;

    private List<String> mDatas;

    private ItemListAdapter mAdapter;



    public static Fragment getInstance() {
        return new MainListFrag();
    }




    @Override
    public int getFragmentLayoutId() {
        return R.layout.frag_main_list ;
    }

    @Override
    public void onViewCreate(View v) {

        mRecyclerView
                =  (RecyclerView)v.findViewById(R.id.recycler_items) ;
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mCtx));


        initData();
        mAdapter = new ItemListAdapter(this);
        mRecyclerView.setAdapter(mAdapter);

//        loadData();

    }


    private void loadData(){
        initData();
        mAdapter.notifyDataSetChanged();
    }

    private void initData(){
        if(mDatas==null||mDatas.size()<=0){
            mDatas = new ArrayList<String>();
            mDatas.add("Loader");
            mDatas.add("DiskLuaCache");
            mDatas.add("DBflow");
        }
    }

    @Override
    public void onItemClick(View view, int position) {
        Snackbar.make(this.getView(),mDatas.get(position), 1000  ).show();
    }


    class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ItemViewHolder>{

        MyItemClickListener mLis = null;
        ItemListAdapter( MyItemClickListener lis) {
            mLis = lis ;
        }

        @Override
        public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(mCtx).inflate(R.layout.vh_main_list,parent,false);
            ItemViewHolder holder = new ItemViewHolder(
            v ,mLis
            );

            return holder;
        }

        @Override
        public void onBindViewHolder(ItemViewHolder holder, int position) {

                holder.tv.setText(mDatas.get(position));


        }


        @Override
        public int getItemCount() {

            if(mDatas!=null){
                return mDatas.size() ;
            }else{
                return 0;
            }

        }

        class ItemViewHolder extends RecyclerView.ViewHolder  {

            TextView tv;
            private MyItemClickListener mListener;
            public ItemViewHolder(View itemView,MyItemClickListener lis) {

                super(itemView);
                tv = (TextView) itemView.findViewById(R.id.tv_name);

                mListener = lis;

                tv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mListener.onItemClick(view,ItemViewHolder.this.getLayoutPosition());
                    }
                });
            }


        }



    }


}
  interface MyItemClickListener  {
    public void onItemClick(View view,int position);
}