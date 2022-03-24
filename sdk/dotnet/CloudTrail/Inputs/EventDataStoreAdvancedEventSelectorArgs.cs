// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudTrail.Inputs
{

    public sealed class EventDataStoreAdvancedEventSelectorArgs : Pulumi.ResourceArgs
    {
        [Input("fieldSelectors")]
        private InputList<Inputs.EventDataStoreAdvancedEventSelectorFieldSelectorArgs>? _fieldSelectors;

        /// <summary>
        /// Specifies the selector statements in an advanced event selector. Fields documented below.
        /// </summary>
        public InputList<Inputs.EventDataStoreAdvancedEventSelectorFieldSelectorArgs> FieldSelectors
        {
            get => _fieldSelectors ?? (_fieldSelectors = new InputList<Inputs.EventDataStoreAdvancedEventSelectorFieldSelectorArgs>());
            set => _fieldSelectors = value;
        }

        /// <summary>
        /// Specifies the name of the advanced event selector.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public EventDataStoreAdvancedEventSelectorArgs()
        {
        }
    }
}
