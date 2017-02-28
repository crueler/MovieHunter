package com.leo.moviehunter.tmdb.response;

public class MovieDetail {
    public boolean adult;
    public String backdrop_path;
    public int budget;
    public Genre[] genres;
    public String homepage;
    public int id;
    public String imdb_id;
    public String original_language;
    public String original_title;
    public String overview;
    public float popularity;
    public String poster_path;
    public String release_date;
    public int revenue;
    public int runtime;
    public String status;
    public String tagline;
    public String title;
    public boolean video;
    public float vote_average;
    public int vote_count;

    public ProductionCompanies[] production_companies;
    public class ProductionCompanies {
        public String name;
        public int id;
    }

    public ProductionCountries[] production_countries;
    public class ProductionCountries {
        public String iso_3166_1;
        public String name;
    }

    public SpokenLanguage[] spoken_languages;
    public class SpokenLanguage {
        public String iso_639_1;
        public String name;
    }
}
