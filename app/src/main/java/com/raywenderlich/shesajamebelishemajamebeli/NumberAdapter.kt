package com.raywenderlich.shesajamebelishemajamebeli

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.shesajamebelishemajamebeli.databinding.NumberItemBinding
import com.raywenderlich.shesajamebelishemajamebeli.databinding.TouchItemBinding
import com.raywenderlich.shesajamebelishemajamebeli.databinding.XItemBinding
import javax.xml.xpath.XPathVariableResolver
import kotlin.math.abs

class NumberAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    val data = listOf(1,2,3,4,5,6,7,8,9,10,0,11)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == 10){
            return TouchViewHolder(TouchItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        }else if (viewType == 11){
            return XviewHolder(XItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        }else{
            return NumberViewHolder(NumberItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        }
    }



    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is NumberViewHolder){
            holder.bind()
        }else if (holder is TouchViewHolder){
            holder.bind()
        }else if (holder is XviewHolder){
            holder.bind()
        }
    }


    override fun getItemCount()=data.size

    inner class NumberViewHolder(private val binding: NumberItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(){
                binding.number.text = data[absoluteAdapterPosition].toString()
        }
    }

    inner class TouchViewHolder(private val binding: TouchItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(){
            binding.imageView6.setImageResource(R.drawable.ic_touchlast)
        }
    }

    inner class XviewHolder(private val binding: XItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(){
            binding.imageView6.setImageResource(R.drawable.dapataravebuli)
        }
    }


    override fun getItemViewType(position: Int): Int {
        if (data[position] == 10){
            return 10
        }else if (data[position] == 11){
            return 11
        }else{
            return 1
        }
    }



}