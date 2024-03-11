# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['NetworkInsightsAnalysisArgs', 'NetworkInsightsAnalysis']

@pulumi.input_type
class NetworkInsightsAnalysisArgs:
    def __init__(__self__, *,
                 network_insights_path_id: pulumi.Input[str],
                 filter_in_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 wait_for_completion: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a NetworkInsightsAnalysis resource.
        :param pulumi.Input[str] network_insights_path_id: ID of the Network Insights Path to run an analysis on.
               
               The following arguments are optional:
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filter_in_arns: A list of ARNs for resources the path must traverse.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[bool] wait_for_completion: If enabled, the resource will wait for the Network Insights Analysis status to change to `succeeded` or `failed`. Setting this to `false` will skip the process. Default: `true`.
        """
        pulumi.set(__self__, "network_insights_path_id", network_insights_path_id)
        if filter_in_arns is not None:
            pulumi.set(__self__, "filter_in_arns", filter_in_arns)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if wait_for_completion is not None:
            pulumi.set(__self__, "wait_for_completion", wait_for_completion)

    @property
    @pulumi.getter(name="networkInsightsPathId")
    def network_insights_path_id(self) -> pulumi.Input[str]:
        """
        ID of the Network Insights Path to run an analysis on.

        The following arguments are optional:
        """
        return pulumi.get(self, "network_insights_path_id")

    @network_insights_path_id.setter
    def network_insights_path_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "network_insights_path_id", value)

    @property
    @pulumi.getter(name="filterInArns")
    def filter_in_arns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of ARNs for resources the path must traverse.
        """
        return pulumi.get(self, "filter_in_arns")

    @filter_in_arns.setter
    def filter_in_arns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "filter_in_arns", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="waitForCompletion")
    def wait_for_completion(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled, the resource will wait for the Network Insights Analysis status to change to `succeeded` or `failed`. Setting this to `false` will skip the process. Default: `true`.
        """
        return pulumi.get(self, "wait_for_completion")

    @wait_for_completion.setter
    def wait_for_completion(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_completion", value)


@pulumi.input_type
class _NetworkInsightsAnalysisState:
    def __init__(__self__, *,
                 alternate_path_hints: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisAlternatePathHintArgs']]]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 explanations: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisExplanationArgs']]]] = None,
                 filter_in_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 forward_path_components: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisForwardPathComponentArgs']]]] = None,
                 network_insights_path_id: Optional[pulumi.Input[str]] = None,
                 path_found: Optional[pulumi.Input[bool]] = None,
                 return_path_components: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisReturnPathComponentArgs']]]] = None,
                 start_date: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 status_message: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 wait_for_completion: Optional[pulumi.Input[bool]] = None,
                 warning_message: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NetworkInsightsAnalysis resources.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisAlternatePathHintArgs']]] alternate_path_hints: Potential intermediate components of a feasible path. Described below.
        :param pulumi.Input[str] arn: ARN of the Network Insights Analysis.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisExplanationArgs']]] explanations: Explanation codes for an unreachable path. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Explanation.html) for details.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filter_in_arns: A list of ARNs for resources the path must traverse.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisForwardPathComponentArgs']]] forward_path_components: The components in the path from source to destination. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
        :param pulumi.Input[str] network_insights_path_id: ID of the Network Insights Path to run an analysis on.
               
               The following arguments are optional:
        :param pulumi.Input[bool] path_found: Set to `true` if the destination was reachable.
        :param pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisReturnPathComponentArgs']]] return_path_components: The components in the path from destination to source. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
        :param pulumi.Input[str] start_date: The date/time the analysis was started.
        :param pulumi.Input[str] status: The status of the analysis. `succeeded` means the analysis was completed, not that a path was found, for that see `path_found`.
        :param pulumi.Input[str] status_message: A message to provide more context when the `status` is `failed`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[bool] wait_for_completion: If enabled, the resource will wait for the Network Insights Analysis status to change to `succeeded` or `failed`. Setting this to `false` will skip the process. Default: `true`.
        :param pulumi.Input[str] warning_message: The warning message.
        """
        if alternate_path_hints is not None:
            pulumi.set(__self__, "alternate_path_hints", alternate_path_hints)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if explanations is not None:
            pulumi.set(__self__, "explanations", explanations)
        if filter_in_arns is not None:
            pulumi.set(__self__, "filter_in_arns", filter_in_arns)
        if forward_path_components is not None:
            pulumi.set(__self__, "forward_path_components", forward_path_components)
        if network_insights_path_id is not None:
            pulumi.set(__self__, "network_insights_path_id", network_insights_path_id)
        if path_found is not None:
            pulumi.set(__self__, "path_found", path_found)
        if return_path_components is not None:
            pulumi.set(__self__, "return_path_components", return_path_components)
        if start_date is not None:
            pulumi.set(__self__, "start_date", start_date)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if status_message is not None:
            pulumi.set(__self__, "status_message", status_message)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if wait_for_completion is not None:
            pulumi.set(__self__, "wait_for_completion", wait_for_completion)
        if warning_message is not None:
            pulumi.set(__self__, "warning_message", warning_message)

    @property
    @pulumi.getter(name="alternatePathHints")
    def alternate_path_hints(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisAlternatePathHintArgs']]]]:
        """
        Potential intermediate components of a feasible path. Described below.
        """
        return pulumi.get(self, "alternate_path_hints")

    @alternate_path_hints.setter
    def alternate_path_hints(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisAlternatePathHintArgs']]]]):
        pulumi.set(self, "alternate_path_hints", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the Network Insights Analysis.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def explanations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisExplanationArgs']]]]:
        """
        Explanation codes for an unreachable path. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Explanation.html) for details.
        """
        return pulumi.get(self, "explanations")

    @explanations.setter
    def explanations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisExplanationArgs']]]]):
        pulumi.set(self, "explanations", value)

    @property
    @pulumi.getter(name="filterInArns")
    def filter_in_arns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of ARNs for resources the path must traverse.
        """
        return pulumi.get(self, "filter_in_arns")

    @filter_in_arns.setter
    def filter_in_arns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "filter_in_arns", value)

    @property
    @pulumi.getter(name="forwardPathComponents")
    def forward_path_components(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisForwardPathComponentArgs']]]]:
        """
        The components in the path from source to destination. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
        """
        return pulumi.get(self, "forward_path_components")

    @forward_path_components.setter
    def forward_path_components(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisForwardPathComponentArgs']]]]):
        pulumi.set(self, "forward_path_components", value)

    @property
    @pulumi.getter(name="networkInsightsPathId")
    def network_insights_path_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the Network Insights Path to run an analysis on.

        The following arguments are optional:
        """
        return pulumi.get(self, "network_insights_path_id")

    @network_insights_path_id.setter
    def network_insights_path_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_insights_path_id", value)

    @property
    @pulumi.getter(name="pathFound")
    def path_found(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to `true` if the destination was reachable.
        """
        return pulumi.get(self, "path_found")

    @path_found.setter
    def path_found(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "path_found", value)

    @property
    @pulumi.getter(name="returnPathComponents")
    def return_path_components(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisReturnPathComponentArgs']]]]:
        """
        The components in the path from destination to source. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
        """
        return pulumi.get(self, "return_path_components")

    @return_path_components.setter
    def return_path_components(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NetworkInsightsAnalysisReturnPathComponentArgs']]]]):
        pulumi.set(self, "return_path_components", value)

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date/time the analysis was started.
        """
        return pulumi.get(self, "start_date")

    @start_date.setter
    def start_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_date", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the analysis. `succeeded` means the analysis was completed, not that a path was found, for that see `path_found`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="statusMessage")
    def status_message(self) -> Optional[pulumi.Input[str]]:
        """
        A message to provide more context when the `status` is `failed`.
        """
        return pulumi.get(self, "status_message")

    @status_message.setter
    def status_message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status_message", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="waitForCompletion")
    def wait_for_completion(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled, the resource will wait for the Network Insights Analysis status to change to `succeeded` or `failed`. Setting this to `false` will skip the process. Default: `true`.
        """
        return pulumi.get(self, "wait_for_completion")

    @wait_for_completion.setter
    def wait_for_completion(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_completion", value)

    @property
    @pulumi.getter(name="warningMessage")
    def warning_message(self) -> Optional[pulumi.Input[str]]:
        """
        The warning message.
        """
        return pulumi.get(self, "warning_message")

    @warning_message.setter
    def warning_message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "warning_message", value)


class NetworkInsightsAnalysis(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 filter_in_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 network_insights_path_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 wait_for_completion: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Provides a Network Insights Analysis resource. Part of the "Reachability Analyzer" service in the AWS VPC console.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        path = aws.ec2.NetworkInsightsPath("path",
            source=source["id"],
            destination=destination["id"],
            protocol="tcp")
        analysis = aws.ec2.NetworkInsightsAnalysis("analysis", network_insights_path_id=path.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Network Insights Analyses using the `id`. For example:

        ```sh
        $ pulumi import aws:ec2/networkInsightsAnalysis:NetworkInsightsAnalysis test nia-0462085c957f11a55
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filter_in_arns: A list of ARNs for resources the path must traverse.
        :param pulumi.Input[str] network_insights_path_id: ID of the Network Insights Path to run an analysis on.
               
               The following arguments are optional:
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[bool] wait_for_completion: If enabled, the resource will wait for the Network Insights Analysis status to change to `succeeded` or `failed`. Setting this to `false` will skip the process. Default: `true`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkInsightsAnalysisArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Network Insights Analysis resource. Part of the "Reachability Analyzer" service in the AWS VPC console.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        path = aws.ec2.NetworkInsightsPath("path",
            source=source["id"],
            destination=destination["id"],
            protocol="tcp")
        analysis = aws.ec2.NetworkInsightsAnalysis("analysis", network_insights_path_id=path.id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Network Insights Analyses using the `id`. For example:

        ```sh
        $ pulumi import aws:ec2/networkInsightsAnalysis:NetworkInsightsAnalysis test nia-0462085c957f11a55
        ```

        :param str resource_name: The name of the resource.
        :param NetworkInsightsAnalysisArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkInsightsAnalysisArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 filter_in_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 network_insights_path_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 wait_for_completion: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkInsightsAnalysisArgs.__new__(NetworkInsightsAnalysisArgs)

            __props__.__dict__["filter_in_arns"] = filter_in_arns
            if network_insights_path_id is None and not opts.urn:
                raise TypeError("Missing required property 'network_insights_path_id'")
            __props__.__dict__["network_insights_path_id"] = network_insights_path_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["wait_for_completion"] = wait_for_completion
            __props__.__dict__["alternate_path_hints"] = None
            __props__.__dict__["arn"] = None
            __props__.__dict__["explanations"] = None
            __props__.__dict__["forward_path_components"] = None
            __props__.__dict__["path_found"] = None
            __props__.__dict__["return_path_components"] = None
            __props__.__dict__["start_date"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["status_message"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["warning_message"] = None
        super(NetworkInsightsAnalysis, __self__).__init__(
            'aws:ec2/networkInsightsAnalysis:NetworkInsightsAnalysis',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alternate_path_hints: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkInsightsAnalysisAlternatePathHintArgs']]]]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            explanations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkInsightsAnalysisExplanationArgs']]]]] = None,
            filter_in_arns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            forward_path_components: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkInsightsAnalysisForwardPathComponentArgs']]]]] = None,
            network_insights_path_id: Optional[pulumi.Input[str]] = None,
            path_found: Optional[pulumi.Input[bool]] = None,
            return_path_components: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkInsightsAnalysisReturnPathComponentArgs']]]]] = None,
            start_date: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            status_message: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            wait_for_completion: Optional[pulumi.Input[bool]] = None,
            warning_message: Optional[pulumi.Input[str]] = None) -> 'NetworkInsightsAnalysis':
        """
        Get an existing NetworkInsightsAnalysis resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkInsightsAnalysisAlternatePathHintArgs']]]] alternate_path_hints: Potential intermediate components of a feasible path. Described below.
        :param pulumi.Input[str] arn: ARN of the Network Insights Analysis.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkInsightsAnalysisExplanationArgs']]]] explanations: Explanation codes for an unreachable path. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Explanation.html) for details.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] filter_in_arns: A list of ARNs for resources the path must traverse.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkInsightsAnalysisForwardPathComponentArgs']]]] forward_path_components: The components in the path from source to destination. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
        :param pulumi.Input[str] network_insights_path_id: ID of the Network Insights Path to run an analysis on.
               
               The following arguments are optional:
        :param pulumi.Input[bool] path_found: Set to `true` if the destination was reachable.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NetworkInsightsAnalysisReturnPathComponentArgs']]]] return_path_components: The components in the path from destination to source. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
        :param pulumi.Input[str] start_date: The date/time the analysis was started.
        :param pulumi.Input[str] status: The status of the analysis. `succeeded` means the analysis was completed, not that a path was found, for that see `path_found`.
        :param pulumi.Input[str] status_message: A message to provide more context when the `status` is `failed`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[bool] wait_for_completion: If enabled, the resource will wait for the Network Insights Analysis status to change to `succeeded` or `failed`. Setting this to `false` will skip the process. Default: `true`.
        :param pulumi.Input[str] warning_message: The warning message.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkInsightsAnalysisState.__new__(_NetworkInsightsAnalysisState)

        __props__.__dict__["alternate_path_hints"] = alternate_path_hints
        __props__.__dict__["arn"] = arn
        __props__.__dict__["explanations"] = explanations
        __props__.__dict__["filter_in_arns"] = filter_in_arns
        __props__.__dict__["forward_path_components"] = forward_path_components
        __props__.__dict__["network_insights_path_id"] = network_insights_path_id
        __props__.__dict__["path_found"] = path_found
        __props__.__dict__["return_path_components"] = return_path_components
        __props__.__dict__["start_date"] = start_date
        __props__.__dict__["status"] = status
        __props__.__dict__["status_message"] = status_message
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["wait_for_completion"] = wait_for_completion
        __props__.__dict__["warning_message"] = warning_message
        return NetworkInsightsAnalysis(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="alternatePathHints")
    def alternate_path_hints(self) -> pulumi.Output[Sequence['outputs.NetworkInsightsAnalysisAlternatePathHint']]:
        """
        Potential intermediate components of a feasible path. Described below.
        """
        return pulumi.get(self, "alternate_path_hints")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the Network Insights Analysis.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def explanations(self) -> pulumi.Output[Sequence['outputs.NetworkInsightsAnalysisExplanation']]:
        """
        Explanation codes for an unreachable path. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Explanation.html) for details.
        """
        return pulumi.get(self, "explanations")

    @property
    @pulumi.getter(name="filterInArns")
    def filter_in_arns(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of ARNs for resources the path must traverse.
        """
        return pulumi.get(self, "filter_in_arns")

    @property
    @pulumi.getter(name="forwardPathComponents")
    def forward_path_components(self) -> pulumi.Output[Sequence['outputs.NetworkInsightsAnalysisForwardPathComponent']]:
        """
        The components in the path from source to destination. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
        """
        return pulumi.get(self, "forward_path_components")

    @property
    @pulumi.getter(name="networkInsightsPathId")
    def network_insights_path_id(self) -> pulumi.Output[str]:
        """
        ID of the Network Insights Path to run an analysis on.

        The following arguments are optional:
        """
        return pulumi.get(self, "network_insights_path_id")

    @property
    @pulumi.getter(name="pathFound")
    def path_found(self) -> pulumi.Output[bool]:
        """
        Set to `true` if the destination was reachable.
        """
        return pulumi.get(self, "path_found")

    @property
    @pulumi.getter(name="returnPathComponents")
    def return_path_components(self) -> pulumi.Output[Sequence['outputs.NetworkInsightsAnalysisReturnPathComponent']]:
        """
        The components in the path from destination to source. See the [AWS documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_PathComponent.html) for details.
        """
        return pulumi.get(self, "return_path_components")

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> pulumi.Output[str]:
        """
        The date/time the analysis was started.
        """
        return pulumi.get(self, "start_date")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the analysis. `succeeded` means the analysis was completed, not that a path was found, for that see `path_found`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusMessage")
    def status_message(self) -> pulumi.Output[str]:
        """
        A message to provide more context when the `status` is `failed`.
        """
        return pulumi.get(self, "status_message")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="waitForCompletion")
    def wait_for_completion(self) -> pulumi.Output[Optional[bool]]:
        """
        If enabled, the resource will wait for the Network Insights Analysis status to change to `succeeded` or `failed`. Setting this to `false` will skip the process. Default: `true`.
        """
        return pulumi.get(self, "wait_for_completion")

    @property
    @pulumi.getter(name="warningMessage")
    def warning_message(self) -> pulumi.Output[str]:
        """
        The warning message.
        """
        return pulumi.get(self, "warning_message")

