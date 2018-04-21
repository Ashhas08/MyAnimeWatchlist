package com.example.aschwinbruyning.myanimewatchlist.model;

/**
 * Created by Aschwin Bruyning on 13-4-2018.
 */

public class Anime {
    private String mal_id;
    private String title;
    private String title_english;
    private String title_japanese;
    private String image_url;
    private String type;
    private String source;
    private String episodes;
    private String status;
    private String airing; //has to become boolean
    private String aired_string;
    private String score;
    private String rank;
    private String favorites;
    private String synopsis;
    private String premiered;
    private String broadcast;

    public Anime(String mal_id, String title, String title_english, String title_japanese, String image_url, String type, String source, String episodes, String status, String airing, String aired_string, String score, String rank, String favorites, String synopsis, String premiered, String broadcast) {
        this.mal_id = mal_id;
        this.title = title;
        this.title_english = title_english;
        this.title_japanese = title_japanese;
        this.image_url = image_url;
        this.type = type;
        this.source = source;
        this.episodes = episodes;
        this.status = status;
        this.airing = airing;
        this.aired_string = aired_string;
        this.score = score;
        this.rank = rank;
        this.favorites = favorites;
        this.synopsis = synopsis;
        this.premiered = premiered;
        this.broadcast = broadcast;
    }

    public Anime() {

    }

    public String getMal_id() {
        return mal_id;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle_english() {
        return title_english;
    }

    public String getTitle_japanese() {
        return title_japanese;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getType() {
        return type;
    }

    public String getSource() {
        return source;
    }

    public String getEpisodes() {
        return episodes;
    }

    public String getStatus() {
        return status;
    }

    public String getAiring() {
        return airing;
    }

    public String getAired_string() {
        return aired_string;
    }

    public String getScore() {
        return score;
    }

    public String getRank() {
        return rank;
    }

    public String getFavorites() {
        return favorites;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getPremiered() {
        return premiered;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public void setMal_id(String mal_id) {
        this.mal_id = mal_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitle_english(String title_english) {
        this.title_english = title_english;
    }

    public void setTitle_japanese(String title_japanese) {
        this.title_japanese = title_japanese;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAiring(String airing) {
        this.airing = airing;
    }

    public void setAired_string(String aired_string) {
        this.aired_string = aired_string;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setPremiered(String premiered) {
        this.premiered = premiered;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }
}
