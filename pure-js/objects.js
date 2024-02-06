function run() {
    // 3 primitive **values**
    const stats = {
        hits: 0,
        found: 0,
        notFound: 0
    };
    doStats(stats);
    console.log(`f=${stats.found}, nf=${stats.notFound}, h=${stats.hits}`);
}

function doStats(stats) { // vs 0, 0, 0
    stats.hits++;
    const boolean = true;
    if (boolean) {
        stats.found++;
    }
    else {
        stats.notFound++;
    }
    // const result = [hits, found, notFound];
    // return stats;
}

run();