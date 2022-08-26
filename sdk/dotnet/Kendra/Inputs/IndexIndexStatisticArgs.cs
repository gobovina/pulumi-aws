// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kendra.Inputs
{

    public sealed class IndexIndexStatisticArgs : global::Pulumi.ResourceArgs
    {
        [Input("faqStatistics")]
        private InputList<Inputs.IndexIndexStatisticFaqStatisticArgs>? _faqStatistics;

        /// <summary>
        /// A block that specifies the number of question and answer topics in the index. Detailed below.
        /// </summary>
        public InputList<Inputs.IndexIndexStatisticFaqStatisticArgs> FaqStatistics
        {
            get => _faqStatistics ?? (_faqStatistics = new InputList<Inputs.IndexIndexStatisticFaqStatisticArgs>());
            set => _faqStatistics = value;
        }

        [Input("textDocumentStatistics")]
        private InputList<Inputs.IndexIndexStatisticTextDocumentStatisticArgs>? _textDocumentStatistics;

        /// <summary>
        /// A block that specifies the number of text documents indexed. Detailed below.
        /// </summary>
        public InputList<Inputs.IndexIndexStatisticTextDocumentStatisticArgs> TextDocumentStatistics
        {
            get => _textDocumentStatistics ?? (_textDocumentStatistics = new InputList<Inputs.IndexIndexStatisticTextDocumentStatisticArgs>());
            set => _textDocumentStatistics = value;
        }

        public IndexIndexStatisticArgs()
        {
        }
        public static new IndexIndexStatisticArgs Empty => new IndexIndexStatisticArgs();
    }
}
