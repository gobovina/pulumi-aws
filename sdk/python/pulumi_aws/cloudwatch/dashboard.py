# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DashboardArgs', 'Dashboard']

@pulumi.input_type
class DashboardArgs:
    def __init__(__self__, *,
                 dashboard_body: pulumi.Input[str],
                 dashboard_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a Dashboard resource.
        :param pulumi.Input[str] dashboard_body: The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
        :param pulumi.Input[str] dashboard_name: The name of the dashboard.
        """
        pulumi.set(__self__, "dashboard_body", dashboard_body)
        pulumi.set(__self__, "dashboard_name", dashboard_name)

    @property
    @pulumi.getter(name="dashboardBody")
    def dashboard_body(self) -> pulumi.Input[str]:
        """
        The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
        """
        return pulumi.get(self, "dashboard_body")

    @dashboard_body.setter
    def dashboard_body(self, value: pulumi.Input[str]):
        pulumi.set(self, "dashboard_body", value)

    @property
    @pulumi.getter(name="dashboardName")
    def dashboard_name(self) -> pulumi.Input[str]:
        """
        The name of the dashboard.
        """
        return pulumi.get(self, "dashboard_name")

    @dashboard_name.setter
    def dashboard_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "dashboard_name", value)


@pulumi.input_type
class _DashboardState:
    def __init__(__self__, *,
                 dashboard_arn: Optional[pulumi.Input[str]] = None,
                 dashboard_body: Optional[pulumi.Input[str]] = None,
                 dashboard_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Dashboard resources.
        :param pulumi.Input[str] dashboard_arn: The Amazon Resource Name (ARN) of the dashboard.
        :param pulumi.Input[str] dashboard_body: The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
        :param pulumi.Input[str] dashboard_name: The name of the dashboard.
        """
        if dashboard_arn is not None:
            pulumi.set(__self__, "dashboard_arn", dashboard_arn)
        if dashboard_body is not None:
            pulumi.set(__self__, "dashboard_body", dashboard_body)
        if dashboard_name is not None:
            pulumi.set(__self__, "dashboard_name", dashboard_name)

    @property
    @pulumi.getter(name="dashboardArn")
    def dashboard_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the dashboard.
        """
        return pulumi.get(self, "dashboard_arn")

    @dashboard_arn.setter
    def dashboard_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dashboard_arn", value)

    @property
    @pulumi.getter(name="dashboardBody")
    def dashboard_body(self) -> Optional[pulumi.Input[str]]:
        """
        The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
        """
        return pulumi.get(self, "dashboard_body")

    @dashboard_body.setter
    def dashboard_body(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dashboard_body", value)

    @property
    @pulumi.getter(name="dashboardName")
    def dashboard_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the dashboard.
        """
        return pulumi.get(self, "dashboard_name")

    @dashboard_name.setter
    def dashboard_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dashboard_name", value)


class Dashboard(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dashboard_body: Optional[pulumi.Input[str]] = None,
                 dashboard_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CloudWatch Dashboard resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        main = aws.cloudwatch.Dashboard("main",
            dashboard_body=\"\"\"{
          "widgets": [
            {
              "type": "metric",
              "x": 0,
              "y": 0,
              "width": 12,
              "height": 6,
              "properties": {
                "metrics": [
                  [
                    "AWS/EC2",
                    "CPUUtilization",
                    "InstanceId",
                    "i-012345"
                  ]
                ],
                "period": 300,
                "stat": "Average",
                "region": "us-east-1",
                "title": "EC2 Instance CPU"
              }
            },
            {
              "type": "text",
              "x": 0,
              "y": 7,
              "width": 3,
              "height": 3,
              "properties": {
                "markdown": "Hello world"
              }
            }
          ]
        }

        \"\"\",
            dashboard_name="my-dashboard")
        ```

        ## Import

        CloudWatch dashboards can be imported using the `dashboard_name`, e.g.

        ```sh
         $ pulumi import aws:cloudwatch/dashboard:Dashboard sample <dashboard_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dashboard_body: The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
        :param pulumi.Input[str] dashboard_name: The name of the dashboard.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DashboardArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CloudWatch Dashboard resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        main = aws.cloudwatch.Dashboard("main",
            dashboard_body=\"\"\"{
          "widgets": [
            {
              "type": "metric",
              "x": 0,
              "y": 0,
              "width": 12,
              "height": 6,
              "properties": {
                "metrics": [
                  [
                    "AWS/EC2",
                    "CPUUtilization",
                    "InstanceId",
                    "i-012345"
                  ]
                ],
                "period": 300,
                "stat": "Average",
                "region": "us-east-1",
                "title": "EC2 Instance CPU"
              }
            },
            {
              "type": "text",
              "x": 0,
              "y": 7,
              "width": 3,
              "height": 3,
              "properties": {
                "markdown": "Hello world"
              }
            }
          ]
        }

        \"\"\",
            dashboard_name="my-dashboard")
        ```

        ## Import

        CloudWatch dashboards can be imported using the `dashboard_name`, e.g.

        ```sh
         $ pulumi import aws:cloudwatch/dashboard:Dashboard sample <dashboard_name>
        ```

        :param str resource_name: The name of the resource.
        :param DashboardArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DashboardArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dashboard_body: Optional[pulumi.Input[str]] = None,
                 dashboard_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DashboardArgs.__new__(DashboardArgs)

            if dashboard_body is None and not opts.urn:
                raise TypeError("Missing required property 'dashboard_body'")
            __props__.__dict__["dashboard_body"] = dashboard_body
            if dashboard_name is None and not opts.urn:
                raise TypeError("Missing required property 'dashboard_name'")
            __props__.__dict__["dashboard_name"] = dashboard_name
            __props__.__dict__["dashboard_arn"] = None
        super(Dashboard, __self__).__init__(
            'aws:cloudwatch/dashboard:Dashboard',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dashboard_arn: Optional[pulumi.Input[str]] = None,
            dashboard_body: Optional[pulumi.Input[str]] = None,
            dashboard_name: Optional[pulumi.Input[str]] = None) -> 'Dashboard':
        """
        Get an existing Dashboard resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dashboard_arn: The Amazon Resource Name (ARN) of the dashboard.
        :param pulumi.Input[str] dashboard_body: The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
        :param pulumi.Input[str] dashboard_name: The name of the dashboard.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DashboardState.__new__(_DashboardState)

        __props__.__dict__["dashboard_arn"] = dashboard_arn
        __props__.__dict__["dashboard_body"] = dashboard_body
        __props__.__dict__["dashboard_name"] = dashboard_name
        return Dashboard(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dashboardArn")
    def dashboard_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the dashboard.
        """
        return pulumi.get(self, "dashboard_arn")

    @property
    @pulumi.getter(name="dashboardBody")
    def dashboard_body(self) -> pulumi.Output[str]:
        """
        The detailed information about the dashboard, including what widgets are included and their location on the dashboard. You can read more about the body structure in the [documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/CloudWatch-Dashboard-Body-Structure.html).
        """
        return pulumi.get(self, "dashboard_body")

    @property
    @pulumi.getter(name="dashboardName")
    def dashboard_name(self) -> pulumi.Output[str]:
        """
        The name of the dashboard.
        """
        return pulumi.get(self, "dashboard_name")

