document.addEventListener("DOMContentLoaded", function () {
    const generateButton = document.getElementById("generateButton");
    const resultDiv = document.getElementById("result");

    generateButton.addEventListener("click", function () {
        const metaTitle = document.getElementById("metaTitle").value;
        const metaDescription = document.getElementById("metaDescription").value;
        const metaKeywords = document.getElementById("metaKeywords").value;

        const metaTags = `
            <meta name="title" content="${metaTitle}">
            <meta name="description" content="${metaDescription}">
            <meta name="keywords" content="${metaKeywords}">
        `;

        resultDiv.innerHTML = metaTags;
    });
});
