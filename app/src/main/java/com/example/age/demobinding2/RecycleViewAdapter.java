package com.example.age.demobinding2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.age.demobinding2.databinding.SportDataBinding;

import java.util.List;

/**
 * Created by Age on 3/20/2017.
 */
public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {
    private Context mContext;
    private List<SportViewModel> mList;
    private LayoutInflater mInflater;
    private SportDataBinding mDataBinding;
    private SportViewModel mModel;

    public RecycleViewAdapter(Context context,
                              List<SportViewModel> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mInflater == null) {
            mInflater = LayoutInflater.from(parent.getContext());
        }
        mDataBinding = SportDataBinding.inflate(mInflater, parent, false);
        return new ViewHolder(mDataBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        mModel = mList.get(position);
        holder.bindData(mModel);
        mDataBinding = holder.getDataBinding();
        mDataBinding.setHandler(new FavImgClickHandler() {
            @Override
            public void onFavImgClick() {
                if (mModel.imgSrcId.get() == R.drawable.yellow_star) {
                    mModel.imgSrcId.set(R.drawable.white_star);
                    Toast.makeText(mContext, R.string.msg_removed, Toast.LENGTH_SHORT)
                        .show();
                } else {
                    mModel.imgSrcId.set(R.drawable.yellow_star);
                    Toast.makeText(mContext, R.string.msg_added, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private SportDataBinding mDataBinding;

        public ViewHolder(SportDataBinding dataBinding) {
            super(dataBinding.getRoot());
            mDataBinding = dataBinding;
        }

        public void bindData(SportViewModel model) {
            if (model == null) return;
            mDataBinding.setViewModel(model);
        }

        public SportDataBinding getDataBinding() {
            return mDataBinding;
        }
    }
}
