package com.leo.moviehunter.tmdb.response;

public class GetConfiguration {

    public Images images;
    public static class Images {
        public String base_url;
        public String secure_base_url;
        public String[] backdrop_sizes;
        public String[] logo_sizes;
        public String[] poster_sizes;
        public String[] profile_sizes;
        public String[] still_sizes;
    }

    public String[] change_keys;
}
