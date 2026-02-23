/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    let result = [];

    for(let i=0; i< arr.length;i++){
        const current = arr[i];

        if(Array.isArray(current) && n>0){
             result.push(...flat(current,n-1));
        }else{
            result.push(current);
        }
    }
    return result;
};