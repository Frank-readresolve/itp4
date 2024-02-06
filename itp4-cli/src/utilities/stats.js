const stats = {
    hits: 0,
    found: 0,
    notFound: 0,

    hitFound: function () {
        this.hits++;
        this.found++;
    },
    hitNotFound: function () {
        this.hits++;
        this.notFound++;
    }
};

export default stats;