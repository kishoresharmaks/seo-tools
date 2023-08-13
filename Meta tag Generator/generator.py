from flask import Flask, request

app = Flask(__name__)

@app.route("/generate-meta-tags", methods=["POST"])
def generate_meta_tags():
    metaTitle = request.form["metaTitle"]
    metaDescription = request.form["metaDescription"]
    metaKeywords = request.form["metaKeywords"]

    metaTags = f"""
        <meta name="title" content="{metaTitle}">
        <meta name="description" content="{metaDescription}">
        <meta name="keywords" content="{metaKeywords}">
    """

    return metaTags

if __name__ == "__main__":
    app.run()
  
