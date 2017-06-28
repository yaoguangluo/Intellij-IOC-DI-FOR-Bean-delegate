package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Entity;


/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Lolroler implements java.io.Serializable {

	// Fields
	private int id;	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName_zh() {
		return name_zh;
	}
	public void setName_zh(String name_zh) {
		this.name_zh = name_zh;
	}
	public int getAp() {
		return ap;
	}
	public void setAp(int ap) {
		this.ap = ap;
	}
	public int getAd() {
		return ad;
	}
	public void setAd(int ad) {
		this.ad = ad;
	}
	public int getStun() {
		return stun;
	}
	public void setStun(int stun) {
		this.stun = stun;
	}
	public int getSlow() {
		return slow;
	}
	public void setSlow(int slow) {
		this.slow = slow;
	}
	public int getMove_fast() {
		return move_fast;
	}
	public void setMove_fast(int move_fast) {
		this.move_fast = move_fast;
	}
	public int getClose() {
		return close;
	}
	public void setClose(int close) {
		this.close = close;
	}
	public int getTurn() {
		return turn;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}
	public int getPena() {
		return pena;
	}
	public void setPena(int pena) {
		this.pena = pena;
	}
	public int getHeal() {
		return heal;
	}
	public void setHeal(int heal) {
		this.heal = heal;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getMagic_avoid() {
		return magic_avoid;
	}
	public void setMagic_avoid(int magic_avoid) {
		this.magic_avoid = magic_avoid;
	}
	public int getAttack_speed() {
		return attack_speed;
	}
	public void setAttack_speed(int attack_speed) {
		this.attack_speed = attack_speed;
	}
	public int getReturned() {
		return returned;
	}
	public void setReturned(int returned) {
		this.returned = returned;
	}
	public int getEye() {
		return eye;
	}
	public void setEye(int eye) {
		this.eye = eye;
	}
	public int getPhisical_avoid() {
		return phisical_avoid;
	}
	public void setPhisical_avoid(int phisical_avoid) {
		this.phisical_avoid = phisical_avoid;
	}
	public int getTrap() {
		return trap;
	}
	public void setTrap(int trap) {
		this.trap = trap;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getDisappear() {
		return disappear;
	}
	public void setDisappear(int disappear) {
		this.disappear = disappear;
	}
	public int getAoe() {
		return aoe;
	}
	public void setAoe(int aoe) {
		this.aoe = aoe;
	}
	public int getHook() {
		return hook;
	}
	public void setHook(int hook) {
		this.hook = hook;
	}
	public int getDivider() {
		return divider;
	}
	public void setDivider(int divider) {
		this.divider = divider;
	}
	public int getCall() {
		return call;
	}
	public void setCall(int call) {
		this.call = call;
	}
	public int getStric() {
		return stric;
	}
	public void setStric(int stric) {
		this.stric = stric;
	}
	public int getNomana() {
		return nomana;
	}
	public void setNomana(int nomana) {
		this.nomana = nomana;
	}
	public int getFlash() {
		return flash;
	}
	public void setFlash(int flash) {
		this.flash = flash;
	}
	private String name;	
	private String name_zh;	
	private int ap ;	
	private int ad;	
	private int stun;	
	private int slow;	
	private int move_fast;	
	private int close;	
	private int turn;	
	private int pena;	
	private int heal;	
	private int life;	
	private int magic_avoid;	
	private int attack_speed;	
	private int returned;	
	private int eye;	
	private int phisical_avoid;
	private int trap;	
	private int range;	
	private int disappear;	
	private int aoe;	
	private int hook;	
	private int divider;
	
	private int call;	
	private int stric;
	private int nomana;	
	private int flash;	
	// Constructors
}