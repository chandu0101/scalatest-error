'use strict';

var webpack = require('webpack');
var path = require('path');
var NODE_ENV = process.env.NODE_ENV;


module.exports = {

    entry: {
        mainpage: './assets/scalajs-output-launcher.js'
    },
    output: {
        path: __dirname + '/assets',
        filename: '[name]-bundle.js'
    },
    plugins: [
        new webpack.NoErrorsPlugin(),
        new webpack.DefinePlugin({
            'process.env': {
                'NODE_ENV': JSON.stringify('development')
            }
        })
    ],
    externals: {
      'cheerio': 'window',
      'react/addons': true,
      'react/lib/ExecutionEnvironment': true,
      'react/lib/ReactContext': true
    },
    module: {
        loaders: [

            {
                test: /\.json$/,
                loader: "json-loader"
            },

            {
                test: /\.css$/,
                loader: 'style-loader!css-loader'
            },

            {
                test: /\.(png|jpg|svg)$/,
                loaders: [
                    'url-loader?limit=8192',
                    'image-webpack?optimizationLevel=7&progressive=true']
            } // inline base64 URLs for <=8k images, direct URLs for the rest,

        ]
    }


};