// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Backup.Inputs
{

    public sealed class ReportPlanReportSettingGetArgs : Pulumi.ResourceArgs
    {
        [Input("frameworkArns")]
        private InputList<string>? _frameworkArns;

        /// <summary>
        /// Specifies the Amazon Resource Names (ARNs) of the frameworks a report covers.
        /// </summary>
        public InputList<string> FrameworkArns
        {
            get => _frameworkArns ?? (_frameworkArns = new InputList<string>());
            set => _frameworkArns = value;
        }

        /// <summary>
        /// Specifies the number of frameworks a report covers.
        /// </summary>
        [Input("numberOfFrameworks")]
        public Input<int>? NumberOfFrameworks { get; set; }

        /// <summary>
        /// Identifies the report template for the report. Reports are built using a report template. The report templates are: `RESOURCE_COMPLIANCE_REPORT` | `CONTROL_COMPLIANCE_REPORT` | `BACKUP_JOB_REPORT` | `COPY_JOB_REPORT` | `RESTORE_JOB_REPORT`.
        /// </summary>
        [Input("reportTemplate", required: true)]
        public Input<string> ReportTemplate { get; set; } = null!;

        public ReportPlanReportSettingGetArgs()
        {
        }
    }
}
