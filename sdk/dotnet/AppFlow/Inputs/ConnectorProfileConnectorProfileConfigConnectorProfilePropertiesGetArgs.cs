// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Inputs
{

    public sealed class ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The connector-specific credentials required when using Amplitude. See Amplitude Connector Profile Credentials for more details.
        /// </summary>
        [Input("amplitude")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesAmplitudeGetArgs>? Amplitude { get; set; }

        /// <summary>
        /// The connector-specific profile properties required when using the custom connector. See Custom Connector Profile Properties for more details.
        /// </summary>
        [Input("customConnector")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesCustomConnectorGetArgs>? CustomConnector { get; set; }

        /// <summary>
        /// Connector-specific properties required when using Datadog. See Generic Connector Profile Properties for more details.
        /// </summary>
        [Input("datadog")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDatadogGetArgs>? Datadog { get; set; }

        /// <summary>
        /// The connector-specific properties required when using Dynatrace. See Generic Connector Profile Properties for more details.
        /// </summary>
        [Input("dynatrace")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesDynatraceGetArgs>? Dynatrace { get; set; }

        /// <summary>
        /// The connector-specific credentials required when using Google Analytics. See Google Analytics Connector Profile Credentials for more details.
        /// </summary>
        [Input("googleAnalytics")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGoogleAnalyticsGetArgs>? GoogleAnalytics { get; set; }

        /// <summary>
        /// The connector-specific credentials required when using Amazon Honeycode. See Honeycode Connector Profile Credentials for more details.
        /// </summary>
        [Input("honeycode")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesHoneycodeGetArgs>? Honeycode { get; set; }

        /// <summary>
        /// The connector-specific properties required when using Infor Nexus. See Generic Connector Profile Properties for more details.
        /// </summary>
        [Input("inforNexus")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesInforNexusGetArgs>? InforNexus { get; set; }

        /// <summary>
        /// Connector-specific properties required when using Marketo. See Generic Connector Profile Properties for more details.
        /// </summary>
        [Input("marketo")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesMarketoGetArgs>? Marketo { get; set; }

        /// <summary>
        /// Connector-specific properties required when using Amazon Redshift. See Redshift Connector Profile Properties for more details.
        /// </summary>
        [Input("redshift")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftGetArgs>? Redshift { get; set; }

        /// <summary>
        /// The connector-specific properties required when using Salesforce. See Salesforce Connector Profile Properties for more details.
        /// </summary>
        [Input("salesforce")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforceGetArgs>? Salesforce { get; set; }

        /// <summary>
        /// The connector-specific properties required when using SAPOData. See SAPOData Connector Profile Properties for more details.
        /// </summary>
        [Input("sapoData")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataGetArgs>? SapoData { get; set; }

        /// <summary>
        /// The connector-specific properties required when using ServiceNow. See Generic Connector Profile Properties for more details.
        /// </summary>
        [Input("serviceNow")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesServiceNowGetArgs>? ServiceNow { get; set; }

        /// <summary>
        /// Connector-specific credentials required when using Singular. See Singular Connector Profile Credentials for more details.
        /// </summary>
        [Input("singular")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSingularGetArgs>? Singular { get; set; }

        /// <summary>
        /// Connector-specific properties required when using Slack. See Generic Connector Profile Properties for more details.
        /// </summary>
        [Input("slack")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSlackGetArgs>? Slack { get; set; }

        /// <summary>
        /// The connector-specific properties required when using Snowflake. See Snowflake Connector Profile Properties for more details.
        /// </summary>
        [Input("snowflake")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSnowflakeGetArgs>? Snowflake { get; set; }

        /// <summary>
        /// The connector-specific credentials required when using Trend Micro. See Trend Micro Connector Profile Credentials for more details.
        /// </summary>
        [Input("trendmicro")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesTrendmicroGetArgs>? Trendmicro { get; set; }

        /// <summary>
        /// Connector-specific properties required when using Veeva. See Generic Connector Profile Properties for more details.
        /// </summary>
        [Input("veeva")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesVeevaGetArgs>? Veeva { get; set; }

        /// <summary>
        /// Connector-specific properties required when using Zendesk. See Generic Connector Profile Properties for more details.
        /// </summary>
        [Input("zendesk")]
        public Input<Inputs.ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesZendeskGetArgs>? Zendesk { get; set; }

        public ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGetArgs()
        {
        }
        public static new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGetArgs Empty => new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesGetArgs();
    }
}
